/**
 * 描述：冒泡排序
 * 
 * @author yingmu
 * 
 * 1、比较相邻的元素。如果第一个比第二个大，就交换他们两个。　
 * 2、对每一对相邻元素做同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
 * 3、针对所有的元素重复以上的步骤，除了最后一个。
 * 4、持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 */
public class SortBubbling {

	public static void main(String[] args) {
		int[] number = { 95, 45, 15, 78, 84, 51, 24, 12 };
		bubble_sort(number);
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
	}

	public static void bubble_sort(int[] arr) {
		int temp, len = arr.length;
		for (int i = 0; i < len - 1; i++)
			for (int j = 0; j < len - 1 - i; j++)
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

}
