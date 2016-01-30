package algorithms.implementation;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		BigInteger factorial = new BigInteger("1");

		if (t >= 1 && t <= 100)
			for (int i = 1; i <= t; i++) {
				factorial = factorial
						.multiply(new BigInteger(String.valueOf(i)));
			}
		else {
			System.out.println("Enter a number greater than zero");
		}

		System.out.println(factorial);
		
		in.close();
	}

}
