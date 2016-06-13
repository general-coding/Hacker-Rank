package algorithms.implementation;

import java.util.Scanner;

public class NewYearChaos {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		while (testCases > 0) {
			testCases--;
			int n = in.nextInt();
			int[] inputLine = new int[n];
			for (int a = 0; a < n; a++) {
				inputLine[a] = in.nextInt();
			}
			int[] outputFrequencyDistribution = new int[n + 1];
			boolean chaos = false;
			boolean finished = false;
			int count = 0;
			while (!finished) {
				finished = true;
				for (int a = 0; a < n - 1; a++) {
					if (inputLine[a] > inputLine[a + 1]) {
						outputFrequencyDistribution[inputLine[a]]++;
						if (outputFrequencyDistribution[inputLine[a]] > 2) {
							finished = true;
							chaos = true; // if it's too chaotic, break out
							break;
						}
						count++;
						int temp = inputLine[a];
						inputLine[a] = inputLine[a + 1];
						inputLine[a + 1] = temp;
						finished = false;
					}
				}
			}
			if (chaos) {
				System.out.println("Too chaotic");
			} else {
				System.out.println(count);
			}
		}

		in.close();
	}
}
