package datastructures.linkedlists;

public class GetNodeValue {
	class Node {
		int data;
		Node next;
	}

	int GetNode(Node head, int n) {
		int nodes = 0;
		Node node = head;
		while (node != null) {
			node = node.next;
			nodes++;
		}
		nodes = nodes - n;
		while (--nodes > 0) {
			head = head.next;
		}
		return head.data;
	}

	public static void main(String[] args) {

	}

}
