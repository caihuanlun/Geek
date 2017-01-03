package kmp;
/**
 * Java实现KMP算法
 * 
 * 思想：每当一趟匹配过程中出现字符比较不等，不需要回溯i指针， 而是利用已经得到的“部分匹配”的结果将模式向右“滑动”尽可能远 的一段距离后，继续进行比较。
 * 
 * 时间复杂度O(n+m)
 * 
 * @author Allen
 * 
 */
public class KMP {

	public static void main(String args[]) {
		 String str = "BBC ABCDAB ABCDABCDABDE";
	        String sub = "ABCDAB";

	        int index = kmp(str, sub);
	        System.out.println("下标位置：" + index);
	}

	/**
     * 用于计算匹配的位置（从头到尾）
     * 
     * @param str
     * @param sub
     * @return
     */
    public static int kmp(String str, String sub) {
        if(str == null || sub == null || str.length() == 0 || sub.length() == 0){
            throw new IllegalArgumentException("str或者sub不能为空");
        }

        int j = 0;
        int[] n = next(sub);
        for (int i = 0; i < str.length(); i++) {
            while(j > 0 && str.charAt(i) != sub.charAt(j)){
                j = n[j - 1];
            }

            if(str.charAt(i) == sub.charAt(j)){
                j++;
            }

            if(sub.length() == j){
                int index = i - j + 1;
                return index;
            }
        }

        return -1;
    }

    /**
     * 用于生成部分匹配表
     * @param sub
     * @return
     */
    private static int[] next(String sub) {
        int[] n = new int[sub.length()];
        int x = 0;
        for (int i = 1; i < sub.length(); i++) {
            while (x > 0 && sub.charAt(x) != sub.charAt(x)) {
                x = n[x - 1];
            }

            if (sub.charAt(i) == sub.charAt(x)) {
                x++;
            }

            n[i] = x;
        }
        return n;
    }
}
