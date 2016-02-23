package datastructures.trees;

public class TreePostorderTraversal {

	class Node {
		int data;
		Node left;
		Node right;
	}

	void Postorder(Node root) {
		while (root != null) {
			root = root.left;
		}
	}

	public static void main(String[] args) {

	}

}
