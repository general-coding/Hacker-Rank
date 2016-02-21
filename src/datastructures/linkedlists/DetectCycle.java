package datastructures.linkedlists;

public class DetectCycle {
	class Node {
		int data;
		Node next;
	}

	int HasCycle(Node head) {
		if (head == null) {
			return 0;
		}

		Node curr = head;
		Node next = head;

		while (curr != null && curr.next != null) {
			curr = curr.next;
			next = next.next.next;

			if (curr == null || next == null) {
				return 0;
			}

			if (curr == next) {
				return 1;
			}
		}

		return 0;
	}

	public static void main(String[] args) {

	}

}
