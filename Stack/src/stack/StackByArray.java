package stack;
import java.util.Arrays;

/**
 * ����ʵ��ջ
 * @author Allen
 *
 */
public class StackByArray<E> {
	private Object[] stack;
	
	public int size;// �����д洢Ԫ�صĸ���
	
	public StackByArray() {
		stack = new Object[10];// ��ʼ����Ϊ10
	}
	
	/**
	 * �ж϶�ջ�Ƿ�Ϊ��
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	
	/**
	 * ѹջ
	 * @param item
	 * @return
	 */
	public E push(E item) {
		ensureCapacity(size + 1);// �������
		
		stack[size++] = item;
		return item;
	}
	
	/**
	 * ��ջ
	 * @return
	 */
	public E pop() {
		E e = peek();
		stack[size -1] = null;
		size--;
		return e;
	}
	
	/**
	 * ջ��Ԫ��
	 * @return
	 */
	public E peek() {
		if (isEmpty()) {
			return null;
		}
		
		return (E) stack[size -1];
	}
	
	/**
	 * �ж������Ƿ�������������������������ռ�
	 * @param size
	 */
	private void ensureCapacity(int size) {
		int len = stack.length;
		
		if (size > len) {// ��������
			int newLen = 10;// ÿ���������������
			stack = Arrays.copyOf(stack, newLen);
		}
	}
}
