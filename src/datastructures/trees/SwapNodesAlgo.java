package datastructures.trees;

import java.util.Scanner;

public class SwapNodesAlgo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int tree[][] = new int[n + 1][2];

		for (int i = 1; i < n + 1; i++) {
			for (int j = 0; j < 2; j++) {
				tree[i][j] = in.nextInt();
			}
		}

		int target = in.nextInt();
		for (int i = 0; i < target; i++) {
			swap(tree, 1, in.nextInt(), 1);
			System.out.println();
		}
	}

	static void swap(int tree[][], int node, int target, int depth) {
		if (node == -1) {
			return;
		}

		if (depth % target == 0) {
			int temp = tree[node][0];
			tree[node][0] = tree[node][1];
			tree[node][1] = tree[node][0];
		}

		swap(tree, tree[node][0], target, depth + 1);
		System.out.print(Integer.toString(node) + " ");
		swap(tree, tree[node][1], target, depth + 1);
	}
}
