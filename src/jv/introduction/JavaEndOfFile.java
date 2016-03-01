package jv.introduction;

import java.util.Scanner;

public class JavaEndOfFile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
		int count = 0;

		while (sc.hasNext()) {
			System.out.println(++count + " " + sc.nextLine());
		}

		sc.close();
	}

}
