package algorithms.implementation;

import java.util.*;

public class CavityMap {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String grid[] = new String[n];
		for (int grid_i = 0; grid_i < n; grid_i++) {
			grid[grid_i] = in.next();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
					System.out.print(grid[i].charAt(j));
				} else if (grid[i].charAt(j) > grid[i].charAt(j - 1) && grid[i].charAt(j - 1) != 'X'
						&& grid[i].charAt(j) > grid[i].charAt(j + 1) && grid[i].charAt(j + 1) != 'X'
						&& grid[i].charAt(j) > grid[i - 1].charAt(j) && grid[i - 1].charAt(j) != 'X'
						&& grid[i].charAt(j) > grid[i + 1].charAt(j) && grid[i + 1].charAt(j) != 'X') {
					System.out.print("X");
				} else {
					System.out.print(grid[i].charAt(j));
				}
			}
			System.out.println();
		}

		in.close();
	}

}
