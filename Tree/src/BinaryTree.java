import bean.Node;

/**
 * 二叉排序树
 * @author Allen
 *
 */
public class BinaryTree {
	private Node root;
	
	public BinaryTree() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	
	/**
	 * 将data插入到排序二叉树中
	 * @param data
	 */
	public void insert(int data){
		Node newNode = new Node(data);
		
		if (root == null) {
			root = newNode;
		} else {
			Node current = root;
			Node parent;
			while(true) {//寻找插入的位置
				parent = current;
				if (data < current.data) {
					current = current.left;
					if (current == null) {
						parent.left = newNode;
						return;
					} 
				} else {
					current = current.right;
					if (current == null) {
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}
	
	/**
	 * 将数值输入构建二叉树
	 * @param data
	 */
	public void buildTree(int[] data){
		for (int i = 0; i < data.length; i++) {
			insert(data[i]);
		}
	}
	
	/**
	 * 中序遍历递归实现
	 */
	public void inOrder(Node localRoot){
		if (localRoot != null) {
			inOrder(localRoot.left);
			System.out.print(localRoot.data + " ");
			inOrder(localRoot.right);
		}
	}
	
	public void inOrder(){
		this.inOrder(this.root);
	}
	
	/**
	 * 前序遍历递归实现
	 * @param localRoot
	 */
	public void preOrder(Node localRoot){
		if (localRoot != null) {
			System.out.print(localRoot.data + " ");
			inOrder(localRoot.left);
			inOrder(localRoot.right);
		}
	}
	
	public void preOrder(){
		this.preOrder(this.root);
	}
	
	/**
	 * 后序遍历递归实现
	 * @param localRoot
	 */
	public void postOrder(Node localRoot){
		if (localRoot != null) {
			inOrder(localRoot.left);
			inOrder(localRoot.right);
			System.out.print(localRoot.data + " ");
		}
	}
	
	public void postOrder(){
		this.postOrder(this.root);
	}
}
