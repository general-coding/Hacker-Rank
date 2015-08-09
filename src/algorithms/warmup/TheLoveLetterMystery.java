package algorithms.warmup;

/*
 * Problem Statement
 * The Love Letter Mystery
 * https://www.hackerrank.com/challenges/the-love-letter-mystery
 */

import java.util.Scanner;

public class TheLoveLetterMystery {
	static int checkPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		int count = 0;
		
//		System.out.println(s);
		while (j > i) {
			if (s.charAt(i) != s.charAt(j)) {
				int tmp = Math.abs(s.charAt(i) - s.charAt(j));
//				System.out.println(tmp);
				count = count + tmp;
			}

			i++;
			j--;
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int count = 0;
		
		for (int i = 0; i < t; i++) {
			String s = in.next();
			for (int j = 0; j < s.length(); j++) {
				count = checkPalindrome(s);
			}
			System.out.println(count);
		}
		
		in.close();
	}
}