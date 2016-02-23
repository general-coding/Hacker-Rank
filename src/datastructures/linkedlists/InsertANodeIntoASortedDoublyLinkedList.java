package datastructures.linkedlists;

public class InsertANodeIntoASortedDoublyLinkedList {

	class Node {
		int data;
		Node next;
		Node prev;
	}

	Node SortedInsert(Node head, int data) {
		if(head == null){
			Node node = new Node();
			node.data = data;
			return node;
		}
		
		Node node = head;		
		while(node != null){
			if(node.data >= data){
				Node insert = new Node();
				insert.data = data;
				insert.prev = node.prev;
				insert.next = node;
				node.prev = insert;
				if(insert.prev == null){
					return insert;
				} else{
					insert.prev.next = insert;
					return head;
				}
			}
			if(node.next == null){
				Node insert = new Node();
				insert.data = data;
				insert.prev = node;
				insert.next = null;
				node.next = insert;
				break;
			}
			node = node.next;
		}
		
		return head;
	}

	public static void main(String[] args) {

	}

}
