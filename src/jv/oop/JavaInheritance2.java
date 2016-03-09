package jv.oop;

class Arithmetic {
	public int add(int a, int b) {
		return a + b;
	}
}

class Adder extends Arithmetic {

}

public class JavaInheritance2 {
	public static void main(String[] args) {
		Adder X = new Adder();
		System.out.println("My superclass is: " + X.getClass().getSuperclass().getName());
		System.out.print(X.add(10, 32) + " " + X.add(10, 3) + " " + X.add(10, 10) + "\n");
	}

}
