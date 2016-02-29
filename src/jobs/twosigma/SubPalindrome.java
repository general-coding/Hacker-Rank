package jobs.twosigma;

public class SubPalindrome {
	static int palindrome(String str) {
		int count = 0;

		for (int m = 0; m < str.length() / 2 + 1; m++) {
			for (int k = m + 1; k < str.length(); k++) {
				String origin = str.substring(m, k), reverse = "";
				System.out.print(origin + ":");
				int len = origin.length();

				reverse = new StringBuffer(origin).reverse().toString();
				System.out.println(reverse + " " + len);
				if (origin.equals(reverse)) {
					count++;
					System.out.println(count);
				}
			}
		}

		return count;
	}

	public static void main(String args[]) {
		System.out.println(palindrome("aabaa"));
	}
}
