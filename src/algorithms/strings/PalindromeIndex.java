package algorithms.strings;

import java.util.Scanner;

public class PalindromeIndex {
	static boolean isPalindrome(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

	static int palindromeIndex(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				if (isPalindrome(s.substring(0, i) + s.substring(i + 1, s.length()))) {
					return i;
				} else {
					return s.length() - i - 1;
				}
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println(palindromeIndex(in.next()));
		}

		in.close();
	}

}
