package datastructures.linkedlists;

public class DeleteDuplicateValueNodesFromASortedLinkedList {
	class Node {
		int data;
		Node next;
	}

	Node RemoveDuplicates(Node head) {
		if(head == null){
			return null;
		}
		
		Node node = head;
		
		while(head.next != null){
			if(head.data == head.next.data){
				head.next = head.next.next;
			}else{
				head = head.next;
			}
		}
		
		return node;
	}

	public static void main(String[] args) {

	}

}
