package jv.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = Integer.parseInt(in.nextLine());

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			int phone = Integer.parseInt(in.nextLine());
			map.put(name, phone);
		}

		for (int i = 0; i < n; i++) {
			try {
				String name = in.nextLine();
				int phone = map.get(name);
				System.out.println(name + "=" + phone);
			} catch (NullPointerException e) {
				System.out.println("Not found");
			}
		}

		in.close();
	}
}
