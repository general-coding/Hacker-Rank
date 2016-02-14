package datastructures.linkedlists;

public class DeleteANode {
	class Node {
		int data;
		Node next;
	}

	Node Delete(Node head, int position) {
		Node node = head;
		if (position == 0) {
			return node.next;
		} else {
			while (--position > 0) {
				node = node.next;
			}

			node.next = node.next.next;
			return head;
		}
	}

	public static void main(String[] args) {

	}

}
