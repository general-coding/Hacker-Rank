package jobs.walmart.labs;

public class KindergartenCandy {

	static int distributeCandy(int[] score) {
		if (score == null || score.length == 0) {
			return 0;
		}

		int[] candy = new int[score.length];
		candy[0] = 1;

		for (int i = 1; i < score.length; i++) {
			if (score[i] > score[i - 1]) {
				candy[i] = candy[i - 1] + 1;
			} else {
				candy[i] = 1;
			}
		}

		int total = candy[score.length - 1];

		for (int i = score.length - 2; i >= 0; i--) {
			int now = 1;

			System.out.println(i + ":" + score[i] + ":" + score[i + 1]);
			if (score[i] > score[i + 1]) {
				now = candy[i + 1] + 1;
			}

			total = total + Math.max(now, candy[i]);
			candy[i] = now;
		}

		return total;
	}

	public static void main(String[] args) {
		int score[] = new int[] { 1, 2, 2, 3, 4, 1, 1, 1 };

		System.out.println(distributeCandy(score));
	}

}