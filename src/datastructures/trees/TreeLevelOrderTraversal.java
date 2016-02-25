package datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeLevelOrderTraversal {

	class Node {
		int data;
		Node left;
		Node right;
	}

	void LevelOrder(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while (!q.isEmpty()) {
			Node dummy = q.poll();
			System.out.print(dummy.data + " ");
			if (dummy.left != null) {
				q.add(dummy.left);
			}
			if (dummy.right != null) {
				q.add(dummy.right);
			}
		}
	}

	public static void main(String[] args) {

	}

}
