package algorithms.warmup;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String am_pm = in.next();

		if (am_pm.equalsIgnoreCase("12:00:00AM")) {
			System.out.println("00:00:00");
		} else if (am_pm.equalsIgnoreCase("12:00:00PM")) {
			System.out.println("12:00:00");
		} else {
			final Pattern pattern = Pattern
					.compile("^([0-1]\\d|2[0-3]):([0-5]\\d):([0-5]\\d)([aApP][mM])$");
			final Matcher matcher = pattern.matcher(am_pm);
			while (matcher.find()) {
				int hh = Integer.parseInt(matcher.group(1));
				String mm = matcher.group(2);
				String ss = matcher.group(3);
				String tt = matcher.group(4);

				if (hh < 12 && tt.equalsIgnoreCase("pm")) {
					System.out.println((hh + 12) + ":" + mm + ":" + ss);
				} else if (hh > 12 && tt.equalsIgnoreCase("pm")) {
					System.out.println(hh + ":" + mm + ":" + ss);
				} else if (hh < 12 && tt.equalsIgnoreCase("am")) {
					if (hh < 10) {
						System.out.println("0" + hh + ":" + mm + ":" + ss);
					} else {
						System.out.println(hh + ":" + mm + ":" + ss);
					}
				} else if (hh == 12 && tt.equalsIgnoreCase("pm")) {
					System.out.println(hh + ":" + mm + ":" + ss);
				} else if (hh == 12 && tt.equalsIgnoreCase("am")) {
					System.out.println("00" + ":" + mm + ":" + ss);
				}
			}
		}

		in.close();
	}
}