package datastructures.trees;

import java.util.Stack;

public class TreeTopView {

	class Node {
		int data;
		Node left;
		Node right;
	}

	void top_view(Node root) {
		Node curr = root;
		Stack<Node> stack = new Stack<Node>();

		while (curr != null) {
			stack.push(curr);
			curr = curr.left;
		}

		while (!stack.empty()) {
			Node dummy = stack.pop();
			System.out.print(dummy.data + " ");
		}

		curr = root.right;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.right;
		}
	}

	public static void main(String[] args) {

	}

}
