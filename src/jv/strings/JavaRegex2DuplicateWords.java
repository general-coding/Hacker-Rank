package jv.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex2DuplicateWords {

	public static void main(String[] args) {
		String pattern = "(^|\\s)([^\\s]+)\\s\\2(\\s|$)";
		Pattern r = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String input = in.nextLine();
			Matcher m = r.matcher(input);
			boolean findMatch = true;
			while (m.find()) {
				input = m.replaceFirst(m.group(1) + m.group(2) + m.group(3));
				m = r.matcher(input);
				findMatch = false;
			}
			System.out.println(input);
			testCases--;
		}

		in.close();
	}
}
