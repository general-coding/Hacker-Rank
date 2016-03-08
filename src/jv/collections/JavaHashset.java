package jv.collections;

import java.util.HashSet;
import java.util.Scanner;

public class JavaHashset {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		HashSet<String> hs = new HashSet<String>();

		int n = Integer.parseInt(in.nextLine());
		int count = 0;

		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			if(hs.add(name)){
				count++;
			}
			System.out.println(count);
		}

		in.close();
	}
}
