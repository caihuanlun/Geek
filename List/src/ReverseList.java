

import bean.Node;

/**
 * 反转单向链表的两种方法
 * 
 * @author Allen
 * 
 */
public class ReverseList {
	
	public static void main(String args[]) {
		Node head = new Node('A');  
        Node node1 = new Node('B');  
        Node node2 = new Node('C');  
        Node node3 = new Node('D');  
  
        head.setNext(node1);  
        node1.setNext(node2);  
        node2.setNext(node3);  
  
        // 打印反转前的链表  
        Node h = head;  
        while (null != h) {  
            System.out.print(h.getData() + " ");  
            h = h.getNext();  
        }  
        // 调用反转方法  
        //head = reverseList1(head);  
        head = reverseList2(head);  
  
        System.out.println("\n");  
        // 打印反转后的结果  
        while (null != head) {  
            System.out.print(head.getData() + " ");  
            head = head.getNext();  
        }  
	}
	
	/**
	 * 递归，在反转当前节点之前先反转后续节点 
	 * 
	 * @param head
	 * @return
	 */
	public static Node reverseList1(Node head) {
		// head看作是前一结点，head.getNext()是当前结点，reHead是反转后新链表的头结点  
        if (head == null || head.getNext() == null) {  
            return head;// 若为空链或者当前结点在尾结点，则直接还回  
        }  
        Node reHead = reverseList1(head.getNext());// 先反转后续节点head.getNext()  
        head.getNext().setNext(head);// 将当前结点的指针域指向前一结点  
        head.setNext(null);// 前一结点的指针域令为null;  
        return reHead;// 反转后新链表的头结点  
	}

	/**
	 * 遍历方法
	 * 
	 * @param current
	 * @return
	 */
	public static Node reverseList2(Node head) {
		 if (head == null)  
	            return head;  
	        Node pre = head;// 上一结点  
	        Node cur = head.getNext();// 当前结点  
	        Node tmp;// 临时结点，用于保存当前结点的指针域（即下一结点）  
	        while (cur != null) {// 当前结点为null，说明位于尾结点  
	            tmp = cur.getNext();  
	            cur.setNext(pre);// 反转指针域的指向  
	  
	            // 指针往下移动  
	            pre = cur;  
	            cur = tmp;  
	        }  
	        // 最后将原链表的头节点的指针域置为null，还回新链表的头结点，即原链表的尾结点  
	        head.setNext(null);  
	          
	        return pre;  
	}
}
