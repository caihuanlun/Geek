package stack;
import java.util.Arrays;

/**
 * 数组实现栈
 * @author Allen
 *
 */
public class StackByArray<E> {
	private Object[] stack;
	
	public int size;// 数组中存储元素的个数
	
	public StackByArray() {
		stack = new Object[10];// 初始长度为10
	}
	
	/**
	 * 判断堆栈是否为空
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	
	/**
	 * 压栈
	 * @param item
	 * @return
	 */
	public E push(E item) {
		ensureCapacity(size + 1);// 检查容量
		
		stack[size++] = item;
		return item;
	}
	
	/**
	 * 弹栈
	 * @return
	 */
	public E pop() {
		E e = peek();
		stack[size -1] = null;
		size--;
		return e;
	}
	
	/**
	 * 栈顶元素
	 * @return
	 */
	public E peek() {
		if (isEmpty()) {
			return null;
		}
		
		return (E) stack[size -1];
	}
	
	/**
	 * 判断数组是否已满，若已满，则扩充数组空间
	 * @param size
	 */
	private void ensureCapacity(int size) {
		int len = stack.length;
		
		if (size > len) {// 数组已满
			int newLen = 10;// 每次数组扩充的容量
			stack = Arrays.copyOf(stack, newLen);
		}
	}
}
