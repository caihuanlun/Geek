package stack;
/**
 * O(1)ʱ�临�ӶȲ���ջ����СԪ��
 * @author Allen
 *
 */
public class SearchMin {
	StackByList<Integer> elem;
	
	StackByList<Integer> min;
	
	public SearchMin() {
		// TODO Auto-generated constructor stub
		elem = new StackByList<Integer>();
		min = new StackByList<Integer>();
	}
	
	/**
	 * ��ջ
	 * @param data
	 */
	public void push(int data) {
		elem.push(data);
		if (min.isEmpty()) {
			min.push(data);
		} else {
			if (data < min.peek()) {// ��ջԪ��С����Сջջ��Ԫ��
				min.push(data);
			}
		}
	}
	
	/**
	 * ��ջ
	 * @return
	 */
	public int pop() {
		int topData = elem.peek();
		elem.pop();
		if (topData == this.min()) {
			min.pop();
		}
		return topData;
	}
	
	public int min() {
		if (min.isEmpty()) {
			return Integer.MAX_VALUE;
		} else {
			return min.peek();
		}
	}

}
