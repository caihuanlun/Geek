import java.util.Stack;

/**
 * 队列,用两个栈来模拟
 * @author Allen
 *
 */
public class Queue<E> {
	private Stack<E> s1 = new Stack<E>();
	private Stack<E> s2 = new Stack<E>();
	
	public synchronized void put (E e) {
		s1.push(e);
	}
	
	public synchronized E pop () {
		if (s2.isEmpty()) {
			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		return s2.pop();
	}
	
	public synchronized boolean empty() {
		return s1.isEmpty() && s2.isEmpty();
	}
	
}
