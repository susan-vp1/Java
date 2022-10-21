package com.javaprg.exception2;

public class Prg5_Example3 {
	public static void main(String args[]) {
		try {
			System.out.println("First statement of try block");
			int num = 45 / 0;
			System.out.println(num);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} finally {
			System.out.println("finally block");
		}
		System.out.println("Out of try-catch-finally block");
	}
}
