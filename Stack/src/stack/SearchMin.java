package stack;
/**
 * O(1)时间复杂度查找栈中最小元素
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
	 * 入栈
	 * @param data
	 */
	public void push(int data) {
		elem.push(data);
		if (min.isEmpty()) {
			min.push(data);
		} else {
			if (data < min.peek()) {// 入栈元素小于最小栈栈顶元素
				min.push(data);
			}
		}
	}
	
	/**
	 * 弹栈
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
