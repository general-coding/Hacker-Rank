package datastructures.trees;

public class TreeInorderTraversal {

	class Node {
		int data;
		Node left;
		Node right;
	}

	void Inorder(Node root) {
		if (root.left != null) {
			Inorder(root.left);
		}

		System.out.print(root.data + " ");

		if (root.right != null) {
			Inorder(root.right);
		}
	}

	public static void main(String[] args) {

	}

}
