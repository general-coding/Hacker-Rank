package jv.introduction;

import java.util.Scanner;

public class JavaStdinAndStdout2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.nextLine());
		double y = Double.parseDouble(sc.nextLine());
		String s = sc.nextLine();

		System.out.println("String: " + s);
		System.out.println("Double: " + y);
		System.out.println("Int: " + x);

		sc.close();
	}

}
