import java.util.ArrayList;
import java.util.Iterator;

/**
 * 描述：桶排序
 * 
 * @author yingmu
 *
 */
public class SortBucket {
	
	public static void main(String[] args) {
        double arr [] ={0.21,0.23,0.76,0.12,0.89};
        SortBucket.bucketSort(arr);
        for(double a:arr){
            System.out.println(a);
        }
    }
	
	/** 
     * 对arr进行桶排序，排序结果仍放在arr中 
     */  
    public static void bucketSort(double arr[]){  
 //-------------------------------------------------分桶-----------------------------------------------      
        int n = arr.length;  
        //存放桶的链表
        ArrayList bucketList[] = new ArrayList [n];  
        //每个桶是一个list，存放此桶的元素   
        for(int i =0;i<n;i++){  
            //下取等
            int temp = (int) Math.floor(n*arr[i]);  
            //若不存在该桶，就新建一个桶并加入到桶链表中
            if(null==bucketList[temp])  
                bucketList[temp] = new ArrayList();  
            //把当前元素加入到对应桶中
            bucketList[temp].add(arr[i]);            
        }  
//-------------------------------------------------桶内排序-----------------------------------------------    
        //对每个桶中的数进行插入排序   
        for(int i = 0;i<n;i++){  
            if(null!=bucketList[i])  
                insert(bucketList[i]);  
        }  
//-------------------------------------------------合并桶内数据-----------------------------------------------    
        //把各个桶的排序结果合并   
        int count = 0; 
        for(int i = 0;i<n;i++){  
            if(null!=bucketList[i]){  
                Iterator iter = bucketList[i].iterator();  
                while(iter.hasNext()){  
                    Double d = (Double)iter.next();  
                    arr[count] = d;  
                    count++;  
                }  
            }  
        }  
    }  

    /** 
     * 用插入排序对每个桶进行排序 
     * 从小到大排序
     */  
    public static void insert(ArrayList list){  

        if(list.size()>1){  
            for(int i =1;i<list.size();i++){  
                if((Double)list.get(i)<(Double)list.get(i-1)){  
                    double temp = (Double) list.get(i);  
                    int j = i-1;  
                    for(;j>=0&&((Double)list.get(j)>(Double)list.get(j+1));j--)  
                        list.set(j+1, list.get(j));  //后移
                    list.set(j+1, temp);  
                }  
            }  
        } 
    }
}
