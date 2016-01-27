package algorithms.warmup;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LibraryFine {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		SimpleDateFormat sdf;
		Date expected, actual;
		int actualYear, actualMonth, actualDay;
		int expectedYear, expectedMonth, expectedDay;
		int fine = 0;
		try {
			sdf = new SimpleDateFormat("dd MM yyyy");

			actual = sdf.parse(in.nextLine());
			actualYear = actual.getYear() + 1900;
			actualMonth = actual.getMonth() + 1;
			actualDay = actual.getDate();

			expected = sdf.parse(in.nextLine());
			expectedYear = expected.getYear() + 1900;
			expectedMonth = expected.getMonth() + 1;
			expectedDay = expected.getDate();

			if (actual.before(expected)) {
				fine = 0;
			} else if (actual.after(expected)) {
				if (actualYear > expectedYear) {
					fine = 10000;
				} else if (actualYear == expectedYear) {
					if (actualMonth > expectedMonth) {
						fine = 500 * (actualMonth - expectedMonth);
					} else if (actualMonth == expectedMonth) {
						if (actualDay > expectedDay) {
							fine = 15 * (actualDay - expectedDay);
						}
					}
				}
			}

			System.out.println(fine);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		in.close();
	}
}