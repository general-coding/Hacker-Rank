package algorithms.strings;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		HashMap<Character, Integer> first = new HashMap<Character, Integer>();
		HashMap<Character, Integer> second = new HashMap<Character, Integer>();

		for (int i = 0; i < n; i++) {
			String s = in.next();

			if (s.length() % 2 == 1) {
				System.out.println(-1);
			} else {
				int mid = s.length() / 2;

				String left = s.substring(0, mid);
				String right = s.substring(mid, s.length());
				System.out.print(left + ", " + right + ", ");

				for (int j = 0; j < left.length(); j++) {
					char c = left.charAt(j);
					if (first.containsKey(c)) {
						int x = first.get(c);
						x++;
						first.put(c, x);
					} else {
						first.put(c, 1);
					}

					System.out.println(c + ":" + first.get(c));
				}
				for (int j = 0; j < right.length(); j++) {
					char c = right.charAt(j);
					if (second.containsKey(c)) {
						int x = second.get(c);
						x++;
						second.put(c, x);
					} else {
						second.put(c, 1);
					}
					
					System.out.println(c + ":" + second.get(c));
				}

				int diff = 0;
				for (Character key : second.keySet()) {
					if (first.containsKey(key)) {
						diff = diff + Math.max(0, second.get(key) - first.get(key));
					} else {
						diff = diff + second.get(key);
					}
				}

				System.out.println(diff);
			}
			
			first.clear();
			second.clear();
		}

		in.close();
	}

}
