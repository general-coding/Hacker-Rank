package jv.oop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JavaIterator {

	@SuppressWarnings("rawtypes")
	static Iterator func(ArrayList al) {
		Iterator it = al.iterator();
		while (it.hasNext()) {
			Object element = it.next();
			if (element instanceof String) {
				break;
			}
		}
		return it;
	}

	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 0; i < n; i++) {
			al.add(sc.nextInt());
		}
		al.add("###");
		for (int i = 0; i < m; i++) {
			al.add(sc.next());
		}

		Iterator it = func(al);
		while (it.hasNext()) {
			Object element = it.next();
			System.out.println((String) element);
		}

		sc.close();
	}
}
