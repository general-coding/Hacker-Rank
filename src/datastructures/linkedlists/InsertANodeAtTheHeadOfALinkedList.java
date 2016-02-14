package datastructures.linkedlists;

public class InsertANodeAtTheHeadOfALinkedList {
	class Node {
		int data;
		Node next;
	}

	Node Insert(Node head, int x) {
		if(head == null){
			head = new Node();
			head.data = x;
			head.next = null;
		}else{
			Node node = new Node();
			node.data = x;
			node.next = head;
			head = node;
		}
		
		return head;
	}

	public static void main(String[] args) {

	}

}
