package algorithms.warmup;

import java.util.Scanner;

/*
 * Problem Statement
 * Simple Array Sum
 * https://www.hackerrank.com/challenges/simple-array-sum
 */

public class SimpleArraySum {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int total = 0;
		
		for(int i=0;i<n;i++){
			total = total + in.nextInt();
		}
		
		System.out.println(total);
	}
}
