package thirtydaysofcode;

import java.util.Scanner;

public class Day06LetUsReview {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		for (int i = 0; i < t; i++) {
			String s = in.next();

			StringBuffer odd = new StringBuffer();
			StringBuffer even = new StringBuffer();

			for (int j = 0; j < s.length(); j++) {
				if (j % 2 == 0) {
					even.append(s.charAt(j));
				} else {
					odd.append(s.charAt(j));
				}
			}
			
			System.out.println(even.toString() + " " + odd.toString());
		}

		in.close();
	}

}
