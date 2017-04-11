package stack;
import bean.Node;

/**
 * Á´±íÊµÏÖµÄÕ»
 * @author Allen
 *
 */
public class StackByList<E> {
	Node<E> top = null;
	
	public boolean isEmpty(){
		return top == null;
	}
	
	/**
	 * Ñ¹Õ»
	 * @param data
	 */
	public void push(E data) {
		Node<E> newNode = new Node<E>(data);
		
		newNode.next = top;
		top = newNode;
	}
	
	/**
	 * µ¯Õ»
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
	 * Õ»¶¥ÔªËØ
	 * @return
	 */
	public E peek() {
		if (isEmpty()) {
			return null;
		}
		return top.data;
	}
}
