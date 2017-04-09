import java.util.Hashtable;

import bean.Node;

/**
 * 链表的删除重复数据
 * @author Allen
 *
 */
public class DeleteDuplecate {
	public static void main(String args[]) {
		Node head = new Node('A');  
        Node node1 = new Node('B');  
        Node node2 = new Node('C');
        Node node3 = new Node('B');
        Node node4 = new Node('D');  
  
        head.setNext(node1);  
        node1.setNext(node2);  
        node2.setNext(node3);  
        node3.setNext(node4);
        
        System.out.println("删除前链表：");
        // 打印链表  
        Node h = head;  
        while (null != h) {  
            System.out.print(h.getData() + " ");  
            h = h.getNext();  
        }  
        
        deleteDuplecateByHashtable(head);
        
        System.out.println("\n删除重复节点后链表："); 
        // 再次打印链表  
   	 	Node h1 = head;
        while (null != h1) {  
            System.out.print(h1.getData() + " ");  
            h1 = h1.getNext();  
        }  
	}
	
	/**
	 * 双重循环遍历，假设外循环当前遍历的节点为cur,内循环从cur开始遍历，若遇到与cur所指向的节点的值相同，则删除这个重复的节点。
	 * @param head
	 */
	public static void deleteDuplecate(Node head) {
		Node p = head;
		while (p != null) {
			Node q = p;
			while (q.getNext() != null) {
				if (p.getData() == q.getNext().getData()) {
					q.setNext(q.getNext().getNext());
				} else {
					q = q.getNext();
				}
			}
			p = p.getNext();
		}
	}
	
	/**
	 * 一次遍历，把遍历到的值放到Hashtable中，在遍历过程，若当前访问的值在Hashtable中已经存在，则重复可以删除节点。
	 * @param head
	 */
	public static void deleteDuplecateByHashtable(Node head) {
		Hashtable<Character, Character> table = new Hashtable<Character, Character>();
		Node tmp = head;
		Node pre = null;
		while (tmp != null) {
			if (table.containsKey(tmp.getData())) {
				pre.setNext(tmp.getNext());
			} else {
				table.put(tmp.getData(), tmp.getData());
				pre = tmp;
			}
			tmp = tmp.getNext();
		}
	}
}
