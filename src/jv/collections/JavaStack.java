package jv.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
	@SuppressWarnings("rawtypes")
	public static boolean check(String s, Map m) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (m.containsKey(c)) {
				stack.push(c);
			} else if (m.containsValue(c) && !stack.empty()) {
				char x = (char) m.get(stack.pop());
				if (c != x) {
					return false;
				}
			} else {
				return false;
			}
		}

		return stack.empty();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put('[', ']');
		map.put('{', '}');
		map.put('(', ')');

		while (in.hasNext()) {
			String s = in.next();
			
			System.out.println(check(s, map));
		}

		in.close();
	}
}
