package datastructures.linkedlists;

public class ReverseALinkedList {
	class Node {
		int data;
		Node next;
	}

	Node Reverse(Node head) {
		if (head == null) {
			return null;
		}
		Node node = null;
		while (head != null) {
			Node dummy = node;
			node = new Node();
			node.data = head.data;
			node.next = dummy;
			head = head.next;
		}
		
		return node;
	}

	public static void main(String[] args) {

	}

}
