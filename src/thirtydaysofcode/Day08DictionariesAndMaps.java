package thirtydaysofcode;

import java.util.HashMap;
import java.util.Scanner;

public class Day08DictionariesAndMaps {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		HashMap<String, Integer> hm = new HashMap<>();

		for (int i = 0; i < n; i++) {
			String name = in.next();
			int number = in.nextInt();

			hm.put(name, number);
		}

		for (int i = 0; i < n; i++) {
			String name = in.next();

			if (hm.containsKey(name)) {
				System.out.println(name + "=" + hm.get(name));
			} else {
				System.out.println("Not found");
			}
		}

		in.close();
	}

}
