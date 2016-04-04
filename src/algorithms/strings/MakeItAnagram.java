package algorithms.strings;

import java.util.HashMap;
import java.util.Scanner;

public class MakeItAnagram {
	static HashMap<Character, Integer> buildMap(String s) {
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();

		for (char key : s.toCharArray()) {
			if (m.containsKey(key)) {
				int value = m.get(key);
				value++;
				m.put(key, value);
			} else{
				m.put(key, 1);
			}
		}

		return m;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String s1 = in.next();
		String s2 = in.next();

		HashMap<Character, Integer> m1 = buildMap(s1);
		HashMap<Character, Integer> m2 = buildMap(s2);
		
		int count = 0;
		
		for(Character key : m2.keySet()){
			if(m1.containsKey(key)){
				count = count + Math.max(0, m2.get(key) - m1.get(key));
			} else{
				count = count + m2.get(key);
			}
		}
		
		for(Character key : m1.keySet()){
			if(m2.containsKey(key)){
				count = count + Math.max(0, m1.get(key) - m2.get(key));
			} else{
				count = count + m1.get(key);
			}
		}
		
		System.out.println(count);

		in.close();
	}
}