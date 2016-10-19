/**
 * 描述：快速排序
 * 
 * @author yingmu
 * 快速排序使用分治法（Divide and conquer）策略来把一个序列（list）分为两个子序列（sub-lists）。
 * 步骤为：
 * 1、从数列中挑出一个元素，称为”基准”（pivot）
 * 2、重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。
 * 在这个分区结束之后，该基准就处于数列的中间位置。这个称为分区（partition）操作。
 * 3、递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序
 *
 */
public class SortQuick {
	
	public static void main(String[] args) {
        int [] arr = {8,1,0,4,6,2,7,9,5,3};
        quickSort(arr,0,arr.length-1);
        for(int i :arr){
            System.out.println(i);
        }
    }
	
    public static void quickSort(int[]arr,int low,int high){
         if (low < high) {     
             int middle = getMiddle(arr, low, high);     
              quickSort(arr, low, middle - 1);            
             quickSort(arr, middle + 1, high);            
          }  
    }
    
    public static int getMiddle(int[] list, int low, int high) {     
        int tmp = list[low];    
        while (low < high) {     
            while (low < high && list[high] >= tmp) {     
                high--;     
            }     
            list[low] = list[high];   
            while (low < high && list[low] <= tmp) {     
                low++;     
            }     
            list[high] = list[low];   
        }     
       list[low] = tmp;           
       return low;                   
    } 

}
