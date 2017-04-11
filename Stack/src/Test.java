import stack.SearchMin;
import stack.StackByArray;
import stack.StackByList;

/**
 * 测试
 * @author Allen
 *
 */
public class Test {
	public static void main(String args[]) {
		StackByArray<Integer> stack1 = new StackByArray<Integer>();
		stack1.push(1);
		stack1.push(2);
		System.out.println("栈中元素个数：" + stack1.size);
		System.out.println("栈顶元素为：" + stack1.pop());
		System.out.println("栈顶元素为：" + stack1.pop());
		
		StackByList<Integer> stack2 = new StackByList<Integer>();
		stack2.push(3);
		stack2.push(4);
		System.out.print("\n");
		System.out.println("栈顶元素为：" + stack2.pop());
		System.out.println("栈顶元素为：" + stack2.pop());
		
		SearchMin stack3 = new SearchMin();
		stack3.push(10);
		stack3.push(7);
		stack3.push(5);
		stack3.push(6);
		stack3.push(8);
		stack3.push(9);
		System.out.print("\n");
		System.out.println("栈中最小元素为：" + stack3.min());
	}
}
