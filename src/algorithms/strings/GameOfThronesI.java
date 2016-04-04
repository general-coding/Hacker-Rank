package algorithms.strings;

import java.util.Arrays;
import java.util.Scanner;

public class GameOfThronesI {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String s = in.next();

		int count = 0;
		boolean found = true;
		int[] letter = new int[26];
		Arrays.fill(letter, 0);

		for (char c : s.toCharArray()) {
			letter[(int) c - (int) 'a'] += 1;
		}
		
		for(int i=0;i<letter.length;i++){
			count += letter[i]%2; 
		}
		
		if(count > 1){
			found = false;
		}
		
		if(found){
			System.out.println("YES");
		} else{
			System.out.println("NO");
		}

		in.close();
	}
}