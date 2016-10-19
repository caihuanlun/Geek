/**
 * 描述：插入排序
 * 
 * @author yingmu
 *
 */
public class SortInsert {
	
	public static void main(String[] args) {

        int[] array = {278,109,63,930,589,184,505,269,8,83};  
        insertSort(array);  
        for(double a : array){
            System.out.println(a);
        }
    }
	
	public static void insertSort(int a[]){  
        int j;       //当前要插入值的位置  
        int preJ;     //依次指向j前的位置  
        int key;       //后移时来暂存要插入的值

        //从数组的第二个位置开始遍历值  
        for(j=1;j<a.length;j++){  
            key=a[j];  
            preJ=j-1;  
            //a[preJ]比当前值大时，a[preJ]后移一位  
            while(preJ>=0 && a[preJ]>key){  
                a[preJ+1]=a[preJ]; //将a[preJ]值后移   

     //这里注意:  a[preJ+1]=a[j]=key,把插入值已经存在了 key中
    //等于说, 留出来一个空白位置来实现依次后移（不会造成数据丢失问题）

                preJ--;         //preJ前移  
            }
            //找到要插入的位置或已遍历完成（(preJ=0）
            a[preJ+1]=key;    //将当前值插入 空白位置
        }  
    } 
}
