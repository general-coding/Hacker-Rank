package algorithms.warmup;

import java.util.*;

public class SolveMeFirst {
	static int solution(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		a = in.nextInt();
		int b;
		b = in.nextInt();
		int sum;
		sum = solution(a, b);
		System.out.println(sum);
		
		in.close();
	}

}
