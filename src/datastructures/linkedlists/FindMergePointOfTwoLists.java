package datastructures.linkedlists;

public class FindMergePointOfTwoLists {
	class Node {
		int data;
		Node next;
	}

	int FindMergeNode(Node headA, Node headB) {
		int headALength = 0, headBLength = 0;
		Node headAX = headA;
		Node headBX = headB;

		while (headAX != null) {
			headAX = headAX.next;
			headALength++;
		}

		while (headBX != null) {
			headBX = headBX.next;
			headBLength++;
		}

		while (headALength > headBLength) {
			headA = headA.next;
			headALength--;
		}

		while (headBLength > headALength) {
			headB = headB.next;
			headBLength--;
		}

		while (headA != null) {
			if (headA == headB) {
				return headA.data;
			}
			headA = headA.next;
			headB = headB.next;
		}
		
		return -1;
	}

	public static void main(String[] args) {

	}

}
