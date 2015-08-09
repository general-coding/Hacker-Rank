package algorithms.warmup;

/*
 * Problem Statement
 * A Very Big Sum
 * https://www.hackerrank.com/challenges/a-very-big-sum
 */

import java.util.Scanner;
import java.math.BigInteger;

public class AVeryBigSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		BigInteger count = new BigInteger("0");
		
		if (t >= 1 && t <= 10) {
			for(int i=0; i< t;i++){
				BigInteger a = in.nextBigInteger();
				
				count = count.add(a);
				
			}
		}

		in.close();
		
		System.out.println(count);
	}
}