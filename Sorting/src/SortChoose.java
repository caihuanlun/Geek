/**
 * 描述：选择排序
 * 
 * @author yingmu
 * 
 * 设所排序序列的记录个数为n，i　取　1,2,…,n-1　。 
 * 从所有n-i+1个记录（Ri,Ri+1,…,Rn）中找出排序码最小（或最大）的记录，与第i个记录交换。
 * 执行n-1趟 后就完成了记录序列的排序。
 *
 */
public class SortChoose {
	
	public static void main(String[] args) {
		int[] number = { 3, 1, 2, 8, 4, 5, 24, 12 };
		SimpleSort(number);
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
	}

	public static void SimpleSort(int[] arr) {
		int length = arr.length;
		int temp;
		for (int i = 0; i < length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < length; j++) { // 寻找最小的数
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			if (min != i) {
				temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
	}
}
