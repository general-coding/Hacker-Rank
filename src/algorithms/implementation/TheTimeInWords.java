package algorithms.implementation;

import java.util.Scanner;

public class TheTimeInWords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int m = in.nextInt();

		if ((h >= 1 && h <= 12) && (m >= 0 && m <= 59)) {
			String words[] = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
					"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
					"nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five",
					"twenty six", "twenty seven", "twenty eight", "twenty nine" };

			String minutes, minute;
			if (m == 1 || m == 59) {
				minutes = "minute";
			} else {
				minutes = "minutes";
			}

			if (h == 12) {
				minute = words[1];
			} else {
				minute = words[h + 1];
			}

			if (m == 0) {
				System.out.println(words[h] + " o' clock");
			} else if (m == 15) {
				System.out.println("quarter past " + words[h]);
			} else if (m == 30) {
				System.out.println("half past " + words[h]);
			} else if (m == 45) {
				System.out.println("quarter to " + minute);
			} else if (m < 30) {
				System.out.println(words[m] + " " + minutes + " past " + words[h]);
			} else {
				System.out.println(words[60 - m] + " " + minutes + " to " + minute);
			}
		}

		in.close();
	}
}
