import bean.Node;

/**
 * 删除链表的某个节点
 * @author Allen
 *
 */
public class DeleteNode {
	public static void main(String args[]) {
		Node head = new Node('A');  
        Node node1 = new Node('B');  
        Node node2 = new Node('C');  
        Node node3 = new Node('D');  
  
        head.setNext(node1);  
        node1.setNext(node2);  
        node2.setNext(node3);  
        
        System.out.println("删除前链表：");
        // 打印链表  
        Node h = head;  
        while (null != h) {  
            System.out.print(h.getData() + " ");  
            h = h.getNext();  
        }  
        
        Node h1 = deleteNode(head, 1);
        
		System.out.println("\n删除后链表：");
		// 再次打印链表
		while (null != h1) {
			System.out.print(h1.getData() + " ");
			h1 = h1.getNext();
		}
		
		System.out.println("\n删除后链表：");
		if (deleteNode(node2)) {
			// 再次打印链表
			while (null != head) {
				System.out.print(head.getData() + " ");
				head = head.getNext();
			}
		} else {
			System.out.println("删除失败");
		}
		
	}
	
	/**
	 * 根据节点位置删除链表节点
	 * @param head
	 * @param index
	 * @return
	 */
	public static Node deleteNode(Node head,int index) {
		if (index < 1 || index > Node.length(head)) {// 删除的位置不合理
			return head;
		}
		
		// 删除链表的第一个元素
		if (index == 1) {
			head = head.getNext();
			return head;
		}
		
		int i = 1;
		Node preNode = head;
		Node curNode = head;
		while (curNode != null) {
			if (i == index) {
				preNode.setNext(curNode.getNext());
				return head;
			}
			preNode = curNode;
			curNode = curNode.getNext();
			i++;
		}
		return head;
	}
	
	/**
	 * 删除不知道头节点的链表的某一个节点
	 * @param node
	 * @return
	 */
	public static boolean deleteNode(Node node) {
		if (node == null || node.getNext() == null) {
			return false;
		}
		
		char tmp = node.getData();
		node.setData(node.getNext().getData());
		node.getNext().setData(tmp);
		node.setNext(node.getNext().getNext());
		return true;
	}
}
