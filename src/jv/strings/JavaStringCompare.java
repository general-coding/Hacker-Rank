package jv.strings;

import java.util.Scanner;

public class JavaStringCompare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		int n = sc.nextInt();
		String low = str.substring(0, n), high = str.substring(0, n);
		for (int i = 0; i < str.length() - n + 1; i++) {
			String x = str.substring(i, i + n);
			if (x.compareTo(low) < 0 || low == null) {
				low = x;
			}
			if (x.compareTo(high) > 0 || high == null) {
				high = x;
			}
		}
		System.out.println(low);
		System.out.println(high);

		sc.close();
	}

}
