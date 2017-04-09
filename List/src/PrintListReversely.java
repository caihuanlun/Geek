import bean.Node;

/**
 * 链表的从尾节点开始打印
 * @author Allen
 *
 */
public class PrintListReversely {
	public static void main(String args[]) {
		Node head = new Node('A');  
        Node node1 = new Node('B');  
        Node node2 = new Node('C');  
        Node node3 = new Node('D');  
  
        head.setNext(node1);  
        node1.setNext(node2);  
        node2.setNext(node3);  
        
        // 打印链表  
        printListReversely(head);
	}
	
	/**
	 * 从尾节点开始打印链表
	 * 利用递归的栈式的结构，先递归到尾节点，从尾节点开始输出
	 * @param head
	 */
	public static void printListReversely(Node head) {
		if (head != null) {
			printListReversely(head.getNext());
			System.out.print(head.getData() + " ");
		}
	}
}
