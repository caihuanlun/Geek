/**
 * 描述：希尔排序
 * 
 * @author yingmu
 * 
 * 把记录按下标的一定增量分组，对每组使用直接插入排序算法排序；
 * 随着增量逐渐减少，每组包含的关键词越来越多，当增量减至1时，整个文件恰被分成一组，算法便终止。
 *
 */
public class SortHill {
	
	public static void main(String[] args) {
		int[] number = { 3, 1, 2, 8, 4, 5, 24, 12 };
		shellSort(number);
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
	}
	
	public static void shellSort(int[] a) {
        int gap = 1, i, j, len = a.length;
        int temp;//插入排序交换值的暂存
        //确定初始步长
        while (gap < len / 3){
            gap = gap * 3 + 1;
        }
        for (; gap > 0; gap /= 3){//循环遍历步长，最后必为1
            for (i = gap; i < len; i++) {//每一列依次向前做插入排序
                temp = a[i];
                //每一列中在a[i]上面且比a[i]大的元素依次向下移动
                for (j = i - gap; j >= 0 && a[j] > temp; j -= gap){
                    a[j + gap] = a[j];
                }
                //a[i]填补空白，完成一列中的依次插入排序
                a[j + gap] = temp;
            }
        }   
    }

}
