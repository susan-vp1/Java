package com.javaprg.exception;

public class Prg_8_HandleRuntimeException {
	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		// Apply try-catch block to handle runtime exception.
		try {
			int z = x / y; // runtime exception.
			System.out.println(z);
		} catch (ArithmeticException ae) {
			System.out.println("A number cannot be divided by zero");
		}
	}
}
