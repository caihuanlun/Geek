/**
 * ��������������
 * @author Allen
 *
 */
public class BinaryTreeTest {
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		int[] data = {2,8,7,4,9,3,1,6,7,5};
		binaryTree.buildTree(data);
		System.out.print("���������������������");
		binaryTree.inOrder();
		System.out.println();
		System.out.print("���������������������");
		binaryTree.preOrder();
		System.out.println();
		System.out.print("�����������ĺ��������");
		binaryTree.postOrder();
	}
}
