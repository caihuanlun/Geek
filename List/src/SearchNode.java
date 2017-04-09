

import bean.Node;

/**
 * 链表的顺序查找
 * 
 * @author Allen
 *
 */
public class SearchNode {
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
        
        // 打印链表  
        Node h = head;  
        while (null != h) {  
            System.out.print(h.getData() + " ");  
            h = h.getNext();  
        }  
        
        
        int id = 0;
        char c = 'B';
        
        id = searchNodeId(head, c);
        System.out.println("\n"); 
        System.out.println("查找的元素" + c + "的位置为：" + id);
        
        Node node;
        int k = 1;
        node = searchKNode(head, k);
        System.out.println("\n"); 
        System.out.println("查找的倒数第" + k + "个元素为：" + node.getData());
        
        Node midNode;
        midNode = searchMidNode(head);
        System.out.println("\n"); 
        System.out.println("查找的中间元素为：" + midNode.getData());
	}
	
	/**
	 * 查找节点的位置
	 * 
	 * @param head
	 * @param data
	 * @return
	 */
	public static int searchNodeId(Node head,char data){
	    int id = 1;
	    while(head != null && head.getData() != data){
	       head = head.getNext();
	       id++;
	    } 
	    if(head == null) id = -1;
	    return id;
	}
	
	/**
	 * 找出单链表中的倒数第k个元素
	 * 两个指针，前指针比当前的指针先走k步，当前指针的下一个节点为空（即尾节点），当前的节点就是要找的元素
	 * @param head
	 * @param k
	 * @return
	 */
	public static Node searchKNode(Node head,int k) {
		if (k < 1 || k > Node.length(head)) {
			return null;
		}
		
		Node pre = head;
		Node cur = head;
		for (int i = 0; i < k; i++) {// 向前移动k步
			pre = pre.getNext();
		}
		while (pre != null) {
			pre = pre.getNext();
			cur = cur.getNext();
		}
		return cur;
	}
	
	/**
	 * 查询单链表的中间节点
	 * 两个指针，前指针比当前的节点快2步，当前指针的下一个节点为空（即尾节点），当前的节点和当前节点的下一个节点就是要找的中间节点
	 * @param head
	 * @return
	 */
	public static Node searchMidNode(Node head) {
		Node pre = head;
		Node cur = head;
		while (pre != null && pre.getNext() != null && pre.getNext().getNext() != null) {
			pre = pre.getNext().getNext();
			cur = cur.getNext();
		}
		return cur;
	}
}
