package datastructures.linkedlists;

public class InsertANodeAtTheTailOfALinkedList {
	class Node {
		int data;
		Node next;
	}

	Node Insert(Node head, int data) {
		if (head == null) {
			head = new Node();
			head.data = data;
			head.next = null;
		} else {
			Node node = head;
			while(node.next!=null){
				node = node.next;
			}
			node.next = new Node();
			node.next.data = data;
			node.next.next = null;
		}

		return head;
	}

	public static void main(String[] args) {

	}

}
