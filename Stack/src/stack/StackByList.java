package stack;
import bean.Node;

/**
 * ����ʵ�ֵ�ջ
 * @author Allen
 *
 */
public class StackByList<E> {
	Node<E> top = null;
	
	public boolean isEmpty(){
		return top == null;
	}
	
	/**
	 * ѹջ
	 * @param data
	 */
	public void push(E data) {
		Node<E> newNode = new Node<E>(data);
		
		newNode.next = top;
		top = newNode;
	}
	
	/**
	 * ��ջ
	 * @return
	 */
	public E pop() {
		if (this.isEmpty()) {
			return null;
		}
		
		E data = top.data;
		top = top.next;
		return data;
	}
	
	/**
	 * ջ��Ԫ��
	 * @return
	 */
	public E peek() {
		if (isEmpty()) {
			return null;
		}
		return top.data;
	}
}
