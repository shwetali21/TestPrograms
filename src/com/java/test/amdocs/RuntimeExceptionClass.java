package com.java.test.amdocs;

public class RuntimeExceptionClass {

	public void m1() {
		try {
			throw new RuntimeException();
		} finally {
			System.out.println("Inside finally.");
		}
	}

	public static void main(String[] args) {
		try {
			RuntimeExceptionClass rec = new RuntimeExceptionClass();
			rec.m1();
			System.out.println("Inside Main Method.");
		} catch(Exception e) {
			System.out.println("Inside Main Method: Exception.");
		}
	}
}

/*Output:
 * Inside finally.
 * Inside Main Method: Exception.
 */
