package datastructures.trees;

public class TreeHuffmanDecoding {

	class Node {
		public int frequency; // the frequency of this tree
		public char data;
		public Node left, right;
	}

	void decode(String S, Node root) {
		String str = " ";

		Node node = root;

		while (!S.isEmpty()) {
			if (S.charAt(0) == '1') {
				node = node.right;
				S = S.substring(1);
			} else {
				node = node.left;
				S = S.substring(1);
			}
			if (node.right == null && node.left == null) {
				str = str + node.data;
				node = root;
			}
		}
		System.out.println(str.trim());
	}

	public static void main(String[] args) {

	}

}
