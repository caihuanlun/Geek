package bean;
/**
 * �ڵ�
 * @author Allen
 *
 */
public class Node<E> {
	public Node<E> next = null;
	public E data;
	
	public Node(E data) {
		this.data = data;
	}
}
