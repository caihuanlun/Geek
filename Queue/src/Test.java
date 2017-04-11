/**
 * 测试
 * @author Allen
 *
 */
public class Test {
	public static void main(String args[]) {
		Queue<Integer> q = new Queue<Integer>();
		
		q.put(1);
		q.put(2);
		
		System.out.println("队列首元素：" + q.pop());
		System.out.println("队列首元素：" + q.pop());
	}
}
