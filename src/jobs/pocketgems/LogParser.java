package jobs.pocketgems;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogParser {
	@SuppressWarnings("finally")
	public static Date count(String str) {
		Date retDate = null;
		// System.out.println(str);
		try {
			String pattern = "^[(](((0[1-9]|1[1-9])[\\/](0[1-9]|[12][0-9]|3[01])[\\/]((19|20))\\d\\d)" + "[-]"
					+ "([0-2][0-9][:][0-5][0-9][:][0-5][0-9]))[)]" + "\\s+[:][:]\\s+"
					+ "(START|CONNECTED|DISCONNECTED|SHUTDOWN)";

			Pattern r = Pattern.compile(pattern);
			Matcher m = r.matcher(str);

			// System.out.println(m.find());

			if (m.find()) {
				// System.out.println(m.groupCount());
				// System.out.println(m.group(0));
				// System.out.println(m.group(1));
				// System.out.println(m.group(2));
				// System.out.println(m.group(3));
				// System.out.println(m.group(4));
				// System.out.println(m.group(5));
				// System.out.println(m.group(6));
				// System.out.println(m.group(7));
				// System.out.println(m.group(8));
				// String date = m.group(1);
				// String time = m.group(6);
				String dateTime = m.group(1);
				String status = m.group(8);

				// System.out.print(dateTime + " : ");
				// System.out.print(status + " : ");

				if (status.equals("START") || status.equals("CONNECTED")) {
					SimpleDateFormat output = new SimpleDateFormat("mm/dd/yyyy-hh:mm:ss");
					// retDate = output.parse(date + "-" + time);
					retDate = output.parse(dateTime);
				}
				if (status.equals("DISCONNECTED")) {
					SimpleDateFormat output = new SimpleDateFormat("mm/dd/yyyy-hh:mm:ss");
					retDate = output.parse(dateTime);
				}
				if (status.equals("SHUTDOWN")) {
					SimpleDateFormat output = new SimpleDateFormat("mm/dd/yyyy-hh:mm:ss");
					retDate = output.parse(dateTime);
				}

				return retDate;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		} finally {
			return retDate;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int lines = Integer.parseInt(in.nextLine());

		Date startTime = null, endTime = null;

		for (int i = 0; i < lines; i++) {
			String str = in.nextLine();

			if (i == 0) {
				startTime = count(str);
				System.out.println(startTime);
			}

			if (i == lines - 1) {
				endTime = count(str);
				System.out.println(endTime);
			}
		}

		long diff = endTime.getTime() - startTime.getTime();
		System.out.println(diff);
		long time = diff / (1000 * 60);

		System.out.println(time);

		in.close();
	}
}
