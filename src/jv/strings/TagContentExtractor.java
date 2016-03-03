package jv.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		String regexPatern = "(<[^>]*>)";
		Pattern stringPatern = Pattern.compile(regexPatern);
		while (testCases > 0) {
			String line = in.nextLine();
			Matcher m = stringPatern.matcher(line);
			String previousHTMLTag = null;
			int previousTagPos = -1;
			boolean find = false;
			while (m.find()) {
				String htmlTag = line.substring(m.start(), m.end());
				if (htmlTag.charAt(1) != '/') {
					previousHTMLTag = htmlTag;
					previousTagPos = m.end();
				} else if (htmlTag.charAt(1) == '/' && previousHTMLTag != null) {
					if (previousHTMLTag.substring(1).equals(htmlTag.substring(2)) && previousHTMLTag.length() > 2
							&& m.start() > previousTagPos + 1) {
						System.out.println(line.substring(previousTagPos, m.start()));
						find = true;
					}
					previousHTMLTag = null;
				}

			}
			System.out.print(find ? "" : "None\n");
			testCases--;
		}
		in.close();
	}
}
