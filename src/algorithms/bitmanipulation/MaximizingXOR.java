package algorithms.bitmanipulation;

/*
 * Problem Statement
 * Maximizing XOR
 * https://www.hackerrank.com/challenges/maximizing-xor
 */

import java.util.Scanner;

public class MaximizingXOR {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		int r = in.nextInt();
		int minXOR = 0;
		int maxXOR = 0;
		
		for (int i = l; i <= r; i++) {
			for (int j = i; j <= r; j++) {
				minXOR = i ^ j;
				
				if (minXOR > maxXOR){
					maxXOR = minXOR;
				}
			}
		}
		
		System.out.println(maxXOR);
		
		in.close();
		
	}

}