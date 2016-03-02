package jv.strings;

import java.util.Scanner;

public class JavaStringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int j = s.length() - 1, len = s.length();
		boolean flag = false;

		for (int i = 0; i < Math.ceil(len) / 2; i++) {
			if (s.charAt(i) == s.charAt(j)) {
				flag = true;
			} else {
				flag = false;
			}
			j--;
		}

		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}

}
