package com.java.test.amdocs;

public class ExceptionClass {
	public static void foo() {
		try {
			throw new Exception();
		} catch(MyException me) {
			System.out.println("Throws MyException");
		} catch(Exception e) {
			System.out.println("Throws Exception.");
		}
	}

	public static void main(String[] args) {
		foo();
	}
}

class MyException extends Exception {
	private static final long serialVersionUID = 1L;
}

/*Output:
Throws Exception.*/