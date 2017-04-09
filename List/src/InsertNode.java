import bean.Node;

/**
 * 链表的数据插入
 * @author Allen
 *
 */
public class InsertNode {
	public static void main(String args[]) {
		Node head = new Node('A');  
        Node node1 = new Node('B');  
        Node node2 = new Node('C');  
        Node node3 = new Node('D');  
  
        head.setNext(node1);  
        node1.setNext(node2);  
        node2.setNext(node3);  
		
        System.out.println("插入前链表：");
        // 打印链表  
        Node h = head;  
        while (null != h) {  
            System.out.print(h.getData() + " ");  
            h = h.getNext();  
        } 
        
        Node h1 = insertNode(head, 'E', 1);
        
		System.out.println("\n插入后链表：");
		// 再次打印链表
		while (null != h1) {
			System.out.print(h1.getData() + " ");
			h1 = h1.getNext();
		}
	}
	
	/**
	 * 向链表的尾节点插入数据
	 * @param head
	 * @param data
	 */
	public static Node insertNode(Node head, char data) {
		Node node = new Node(data);
		
		if (head == null) {
			node.setNext(head);
			head = node;
			return head;
		}
		
		Node tmp = head;
		while (tmp.getNext() != null) {
			tmp = tmp.getNext();
		}
		
		tmp.setNext(node);
		return head;
	}
	
	/**
	 * 向链表的任意位置插入数据
	 * @param head
	 * @param data
	 */
	public static Node insertNode(Node head, char data, int index) {
		Node node = new Node(data); 
		if (index < 1 || index > Node.length(head)) {// 插入的位置不合理
			return head;
		}
		
		// 头节点为空
		if (head == null) {
			node.setNext(head);
			head = node;
			return head;
		}
		
		// 在头节点插入
		if (index == 1) {
			node.setNext(head);
			head = node;
			return head;
		}
		
		Node cur = head; 
		Node pre = head; 
		int i = 1;
		while (i != index) { 
			pre = cur; 
			cur = cur.getNext(); 
			i++;
		} 
		node.setNext(cur); 
		pre.setNext(node); 
		return head;
	}
}
