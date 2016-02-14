package datastructures.arrays;

import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long N = in.nextLong();
		long Q = in.nextLong();
		String arr[] = new String[(int) N];
		long lastans = 0;

		for (long i = 0; i < Q; i++) {
			int act = in.nextInt();
			long x = in.nextLong();
			long y = in.nextLong();
			switch (act) {
			case 1:
				long sequence1 = (x ^ lastans) % N;
				arr[(int) sequence1] = arr[(int) sequence1] + " " + y;
				break;

			case 2:
				long sequence2 = (x ^ lastans) % N;
				String arr3[] = arr[(int) sequence2].split(" ");
				long index = y % (arr3.length - 1);
				lastans = Long.parseLong(arr3[(int) index + 1]);
				System.out.println(lastans);
				break;
			}

		}

		in.close();
	}

}
