package jv.exceptionhandling;

import java.util.Scanner;
import java.lang.Exception;

class myCalculator {
	int power(int n, int p) throws Exception {
		if (n < 0 || p < 0) {
			throw new Exception("n and p should be non-negative");
		} else if (n == 0 && p > 0) {
			return 0;
		} else {
			int ret = 1;
			for (; p > 0; p--)
				ret *= n;
			return ret;
		}
	}
}

public class JavaExceptionHandling {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNextInt()) {
			int n = in.nextInt();
			int p = in.nextInt();
			myCalculator M = new myCalculator();
			try {
				System.out.println(M.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		in.close();
	}

}
