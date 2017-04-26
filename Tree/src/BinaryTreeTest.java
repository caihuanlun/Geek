/**
 * 二叉排序树测试
 * @author Allen
 *
 */
public class BinaryTreeTest {
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		int[] data = {2,8,7,4,9,3,1,6,7,5};
		binaryTree.buildTree(data);
		System.out.print("二叉排序树的中序遍历：");
		binaryTree.inOrder();
		System.out.println();
		System.out.print("二叉排序树的先序遍历：");
		binaryTree.preOrder();
		System.out.println();
		System.out.print("二叉排序树的后序遍历：");
		binaryTree.postOrder();
	}
}
