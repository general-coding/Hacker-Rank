package datastructures.linkedlists;

public class PrintTheElementsOfALinkedList {

	class Node {
		int data;
		Node next;
	}

	void Print(Node head) {
		if (head == null) {
			return;
		}
		Node node = head;
		while (true) {
			System.out.println(node.data);
			if (node.next != null) {
				node = node.next;
			} else {
				break;
			}
		}
	}

	public static void main(String[] args) {

	}

}
