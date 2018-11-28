package com.java.test.hackerearth.barclays;

class A {
	final public int getResult(int a, int b) {
		return 0;
	}
}

class B extends A {
	/*public int getResult(int a, int b) {	//Cannot override the final method from A
		return 1;
	}*/
}
public class Test {
	public static void main(String[] args) {
		B b = new B();
		System.out.println("x = " + b.getResult(0, 1));
	}
}


/*Output: 
Compile Time Error: Cannot override the final method from A*/