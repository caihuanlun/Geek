import bean.Node;

/**
 * 链表的环相关操作
 * @author Allen
 *
 */
public class Loop {
	public static void main(String args[]) {
		Node head = new Node('A');  
        Node node1 = new Node('B');  
        Node node2 = new Node('C');  
        Node node3 = new Node('D');  
        Node node4 = new Node('E');
  
        head.setNext(node1);  
        node1.setNext(node2);  
        node2.setNext(node3);  
        node3.setNext(node4);
        node4.setNext(head);
        
//        // 打印链表  
//        Node h = head;  
//        while (null != h) {  
//            System.out.print(h.getData() + " ");  
//            h = h.getNext();  
//        }  
//        
//        System.out.print("\n");
        if (isLoop(head)) {
			System.out.println("链表具有环");
		} else {
			System.out.println("链表不具有环");
		}
        
        Node node;
        node = findLoopPort(head);
        System.out.println("环的入口点为：" + node.getData());
	}
	
	/**
	 * 检测链表是否有环
	 * 两个指针，快指针比慢指针快2步，两个指针同时向前移动，每一次快指针都要同慢指针比较，当快指针等于慢指针则说明链表有环
	 * @param head
	 * @return
	 */
	public static boolean isLoop(Node head) {
		Node fast = head;
		Node slow = head;
		
		if (head == null) {
			return false;
		}
		
		while (fast != null && fast.getNext() != null) {
			fast = fast.getNext().getNext();
			slow = slow.getNext();
			
			if (fast == slow) {
				return true;
			}
		}
		
		return !(fast == null || fast.getNext() == null);
	}
	
	/**
	 * 查找环的入口节点
	 * @param head
	 * @return
	 */
	public static Node findLoopPort(Node head) {
		Node fast = head;
		Node slow = head;
		
		while (fast != null && fast.getNext() != null) {
			fast = fast.getNext().getNext();
			slow = slow.getNext();
			
			if (fast == slow) {
				break;
			}
		}
		
		if (fast == null && fast.getNext() == null) {
			return null;
		}
		slow = head;
		while (slow != fast) {
			slow = slow.getNext();
			fast = fast.getNext();
		}
		return slow;
	}
}
