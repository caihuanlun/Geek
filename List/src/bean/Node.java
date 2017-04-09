package bean;

/**
 * 链表的节点
 * 
 * @author Allen
 *
 */
public class Node {
	private char Data;// 数据域  
    private Node Next;// 指针域  
    public Node(char Data) {  
        // super();  
        this.Data = Data;  
    }  
    public char getData() {  
        return Data;  
    }  
    public void setData(char Data) {  
        this.Data = Data;  
    }  
  
    public Node getNext() {  
        return Next;  
    }  
    public void setNext(Node Next) {  
        this.Next = Next;  
    }  
    
    /**
     * 返回节点的长度
     * @return
     */
    public static int length(Node head) {
    	int length = 0;
    	
    	Node tmp = head;
    	while(tmp != null) {
    		length ++;
    		tmp = tmp.getNext();
    	}
    	return length;
    }
}
