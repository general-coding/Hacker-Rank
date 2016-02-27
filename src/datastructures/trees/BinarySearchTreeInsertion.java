package datastructures.trees;

public class BinarySearchTreeInsertion {

	class Node {
		int data;
		Node left;
		Node right;
	}

	Node Insert(Node root, int value) {
		Node node = root;
		while (node != null) {
			if (value > node.data) {
				if (node.right != null) {
					node = node.right;
				} else {
					node.right = new Node();
					node.right.data = value;
					break;
				}
			}
			if (value < node.data) {
				if (node.left != null) {
					node = node.left;
				} else {
					node.left = new Node();
					node.left.data = value;
					break;
				}
			}
		}

		if (node == null) {
			node = new Node();
			node.data = value;
			root = node;
		}

		return root;
	}

	public static void main(String[] args) {

	}

}
