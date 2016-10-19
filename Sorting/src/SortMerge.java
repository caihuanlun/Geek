/**
 * 描述：归并排序
 * 
 * @author yingmu
 * 
 * 1、申请空间，使其大小为两个已经排序序列之和，该空间用来存放合并后的序列 
 * 2、设定两个指针，最初位置分别为两个已经排序序列的起始位置
 * 3、比较两个指针所指向的元素，选择相对小的元素放入到合并空间，并移动指针到下一位置 
 * 4、重复步骤3直到某一指针到达序列尾
 * 5、将另一序列剩下的所有元素直接复制到合并序列尾
 * 
 */
public class SortMerge {

	public static void main(String[] args) {
        int [] arr ={6,5,3,1,8,7,2,4};
        merge_sort(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }

	public static void merge_sort(int[] arr) {
		int len = arr.length;
		// 用于合并的临时数组
		int[] result = new int[len];
		int block, start;

		// 两两合并后块大小变大两倍 (注意最后一次block等于len)
		for (block = 1; block <= len; block *= 2) {
			// 把整个数组分成很多个块，每次合并处理两个块
			for (start = 0; start < len; start += 2 * block) {
				int low = start;
				int mid = (start + block) < len ? (start + block) : len;
				int high = (start + 2 * block) < len ? (start + 2 * block)
						: len;
				// 两个块的起始下标及结束下标
				int start1 = low, end1 = mid;
				int start2 = mid, end2 = high;
				// 开始对两个block进行归并排序
				while (start1 < end1 && start2 < end2) {
					result[low++] = arr[start1] < arr[start2] ? arr[start1++]
							: arr[start2++];
				}
				while (start1 < end1) {
					result[low++] = arr[start1++];
				}
				while (start2 < end2) {
					result[low++] = arr[start2++];
				}
			}
			// 每次归并后把结果result存入arr中，以便进行下次归并
			int[] temp = arr;
			arr = result;
			result = temp;
		}
	}

}
