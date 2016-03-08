package jv.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Checker {
	Comparator<Player> desc;

	Checker() {
		desc = new Comparator<Player>() {
			public int compare(Player a, Player b) {
				int x = Integer.valueOf(a.score).compareTo(Integer.valueOf(b.score));

				if (x != 0) {
					return -x;
				}

				return -a.name.compareTo(b.name);
			}
		};
	}
}

class Player {
	String name;
	int score;
}

public class JavaComparator {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine().trim());
		String s;
		StringTokenizer st;
		Player Player[] = new Player[N];
		Checker check = new Checker();
		for (int i = 0; i < N; i++) {
			s = br.readLine().trim();
			st = new StringTokenizer(s);
			Player[i] = new Player();
			Player[i].name = st.nextToken();
			Player[i].score = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(Player, check.desc);
		for (int i = 0; i < Player.length; i++) {
			System.out.printf("%s %s\n", Player[i].name, Player[i].score);
		}

	}
}