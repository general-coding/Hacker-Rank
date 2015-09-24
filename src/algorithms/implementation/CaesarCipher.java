package algorithms.implementation;

import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		String s = in.next();
		int k = in.nextInt();
		StringBuilder enc = new StringBuilder();

		int diff = k % 26 + 26;
		for (int i = 0; i < n; i++) {
			char j = s.charAt(i);
			if (Character.isLetter(j)) {
				if (Character.isUpperCase(j)) {
					enc.append((char) ('A' + (j - 'A' + diff) % 26));
				} else {
					enc.append((char) ('a' + (j - 'a' + diff) % 26));
				}
			} else {
				enc.append(j);
			}
		}

		System.out.println(enc.toString());

		in.close();
	}
}
