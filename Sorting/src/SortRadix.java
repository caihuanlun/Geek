import java.util.ArrayList;
import java.util.List;

/**
 * 描述：基数排序
 * 
 * @author yingmu
 *
 *
 */
public class SortRadix {
	public static void main(String[] args) {

		int[] array = { 278, 109, 63, 930, 589, 184, 505, 269, 8, 83 };
		radixSort(array);
		for (double a : array) {
			System.out.println(a);
		}
	}

	public static void radixSort(int[] array) {

		// ------------------------------------------确定排序的趟数----------------------------------
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		int time = 0;
		while (max > 0) {
			max /= 10;
			time++;
		}
		// ----------------------------------------初始化10个链表用户分配时暂存-------------------------------
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 0; i < 10; i++) {
			List<Integer> item = new ArrayList<Integer>();
			list.add(item);
		}

		// -----------------------------------------进行time次分配和收集-------------------------------------
		for (int i = 0; i < time; i++) {
			// 分配元素;
			for (int j = 0; j < array.length; j++) {
				int index = array[j] % (int) Math.pow(10, i + 1)
						/ (int) Math.pow(10, i);
				list.get(index).add(array[j]);
			}
			// 收集元素;
			int count = 0;
			for (int k = 0; k < 10; k++) {
				if (list.get(k).size() > 0) {
					for (int a : list.get(k)) {
						array[count] = a;
						count++;
					}
					// 清除数据，以便下次收集
					list.get(k).clear();
				}
			}
		}
	}
}
