import bean.Node;

/**
 * 链表的相交的相关操作
 * @author Allen
 *
 */
public class Interset {
	public static void main(String args[]) {
		Node h1 = new Node('A');  
        Node h1_node1 = new Node('C');  
        Node h1_node2 = new Node('D');  
        Node h1_node3 = new Node('B');  
  
        h1.setNext(h1_node1);  
        h1_node1.setNext(h1_node2);  
        h1_node2.setNext(h1_node3); 
        
        // 打印链表  
        Node h1_tmp = h1;
        while (null != h1_tmp) {  
            System.out.print(h1_tmp.getData() + " ");  
            h1_tmp = h1_tmp.getNext();  
        }  
        
        Node h2 = new Node('E');  
        Node h2_node1 = new Node('F');  
        Node h2_node2 = new Node('G'); 
  
        h2.setNext(h2_node1);  
        h2_node1.setNext(h1_node3);  
        h1_node3.setNext(h2_node2);  
        
        System.out.print("\n");
        // 打印链表  
        Node h2_tmp = h2;
        while (null != h2_tmp) {  
            System.out.print(h2_tmp.getData() + " ");  
            h2_tmp = h2_tmp.getNext();  
        }  
        
        System.out.print("\n");
        if (isInterset(h1, h2)) {
			System.out.println("两个链表相交");
		} else {
			System.out.println("两个链表不相交");
		}
        
        Node node;
        node = getFirstMeetNode(h1, h2);
        System.out.println("两个链表相交的节点为：" + node.getData());
	}
	
	/**
	 * 判断两个链表是否相交
	 * @param h1
	 * @param h2
	 * @return
	 */
	public static boolean isInterset(Node h1, Node h2) {
		if (h1 == null || h2 == null) {
			return false;
		}
		
		Node tail1 = h1;
		// 找到链表h1的最后一个节点
		while (tail1.getNext() != null) {
			tail1 = tail1.getNext();
		}
		
		Node tail2 = h2;
		// 找到链表h2的最后一个节点
		while (tail2.getNext() != null) {
			tail2 = tail2.getNext();
		}
		
		return tail1 == tail2;
	}
	
	/**
	 * 查找链表相交的节点
	 * @param h1
	 * @param h2
	 * @return
	 */
	public static Node getFirstMeetNode(Node h1, Node h2) {
		if (h1 == null || h2 == null) {
			return null;
		}
		
		Node tail1 = h1;
		int len1 = 1;
		// 找到链表h1的最后一个节点
		while (tail1.getNext() != null) {
			tail1 = tail1.getNext();
			len1++;
		}
		
		Node tail2 = h2;
		int len2 = 1;
		// 找到链表h2的最后一个节点
		while (tail2.getNext() != null) {
			tail2 = tail2.getNext();
			len2++;
		}
		
		// 两链表不相交
		if (tail1 != tail2) {
			return null;
		}
		
		Node t1 = h1;
		Node t2 = h2;
		// 找出较长的链表，先遍历
		if (len1 > len2) {
			int d = len1 - len2;
			while (d != 0) {
				t1 = t1.getNext();
				d --;
			}
		} else {
			int d = len2 - len1;
			while (d != 0) {
				t2 = t2.getNext();
				d --;
			}
		}
		
		while (t1 != t2) {
			t1 = t1.getNext();
			t2 = t2.getNext();
		}
		
		return t1;
	}
}
