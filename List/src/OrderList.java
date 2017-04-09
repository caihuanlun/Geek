import bean.Node;

/**
 * 链表的排序
 * @author Allen
 *
 */
public class OrderList {
	public static void main(String args[]) {
		Node head = new Node('A');  
        Node node1 = new Node('C');  
        Node node2 = new Node('D');  
        Node node3 = new Node('B');  
  
        head.setNext(node1);  
        node1.setNext(node2);  
        node2.setNext(node3);  
		
        System.out.println("排序前链表：");
        // 打印链表  
        Node h = head;  
        while (null != h) {  
            System.out.print(h.getData() + " ");  
            h = h.getNext();  
        } 
        
        Node h1 = orderList(head);
        
        System.out.println("\n排序后链表：");
        // 再次打印链表  
        while (null != h1) {  
            System.out.print(h1.getData() + " ");  
            h1 = h1.getNext();  
        } 
	}

	/**
	 * 链表的排序
	 * @param head
	 * @return
	 */
	public static Node orderList(Node head) {
		Node nextNode = null;
		char tmp;
		Node curNode = head;
		while (curNode.getNext() != null) {
			nextNode = curNode.getNext();
			while (nextNode != null) {
				if (curNode.getData() > nextNode.getData()) {
					tmp = curNode.getData();
					curNode.setData(nextNode.getData());
					nextNode.setData(tmp);
				}
				nextNode = nextNode.getNext();
			}
			curNode = curNode.getNext();
		}
		return head;
	}
}
