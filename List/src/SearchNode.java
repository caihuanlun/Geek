

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
  
        head.setNext(node1);  
        node1.setNext(node2);  
        node2.setNext(node3);  
        
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
}
