package com.java.test.amdocs;

public class StringExample {
	public static void main(String[] args) {

		String a = "abc";
		Object obj = a;

		System.out.println("String : " + a + ", Object : " + obj);
		Object obj1 = "abc";
		String str = a;

		System.out.println("String : " + str + ", Object : " + obj1);
	}
}
