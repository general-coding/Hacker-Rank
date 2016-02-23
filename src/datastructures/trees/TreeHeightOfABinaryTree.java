package datastructures.trees;

public class TreeHeightOfABinaryTree {

	class Node {
		int data;
		Node left;
		Node right;
	}

	int height(Node root) {
		int left = 0;
		int right = 0;

		if (root != null) {
			if (root.left != null) {
				left = height(root.left);
			}
			if (root.right != null) {
				right = height(root.right);
			}
		}

		if (left > right) {
			return left + 1;
		} else {
			return right + 1;
		}
	}

	public static void main(String[] args) {

	}

}
