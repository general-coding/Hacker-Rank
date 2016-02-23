package datastructures.linkedlists;

public class ReverseADoublyLinkedList {

	class Node {
		int data;
		Node next;
		Node prev;
	}

	Node Reverse(Node head) {
		if (head == null) {
			return null;
		}
		while (head != null) {
			Node rev = head.prev;
			head.prev = head.next;
			head.next = rev;
			if (head.prev == null) {
				return head;
			}
			head = head.prev;
		}
		return head;
	}

	public static void main(String[] args) {

	}

}
