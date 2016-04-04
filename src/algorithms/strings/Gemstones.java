package algorithms.strings;

import java.util.HashSet;
import java.util.Scanner;

public class Gemstones {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		HashSet<Character> all = new HashSet<Character>();
		HashSet<Character> line = new HashSet<Character>();

		for (char c = 'a'; c <= 'z'; c++) {
			all.add(c);
		}

		for (int i = 0; i < n; i++) {
			char[] stones = in.next().toCharArray();

			for (int j = 0; j < stones.length; j++) {
				line.add(stones[j]);
			}

			all.retainAll(line);
			line.clear();
		}
		
		System.out.println(all.size());

		in.close();
	}

}