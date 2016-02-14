package datastructures.linkedlists;

public class PrintInReverse {
	class Node {
		int data;
		Node next;
	}

	void ReversePrint(Node head) {
		Node node = head;

		StringBuilder s = new StringBuilder();

		while (node != null) {
			s.insert(0, Integer.toString(node.data) + '\n');
			node = node.next;
		}
		
		System.out.println(s);
	}

	public static void main(String[] args) {

	}

}
