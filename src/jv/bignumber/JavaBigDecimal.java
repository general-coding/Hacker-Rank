package jv.bignumber;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class JavaBigDecimal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<String> numbers = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			numbers.add(in.next());
		}

		Collections.sort(numbers, new Comparator<String>() {
			public int compare(String a, String b) {
				int x = new BigDecimal(a).compareTo(new BigDecimal(b));
				return (x == 0) ? 1 : -x;
			}
		});

		for (String number : numbers) {
			System.out.println(number);
		}

		in.close();
	}
}
