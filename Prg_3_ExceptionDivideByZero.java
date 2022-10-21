package com.javaprg.exception;

public class Prg_3_ExceptionDivideByZero {
	public static void main(String[] args) {
		System.out.println("One");
		System.out.println("Two");

		int a = 1 / 0; // Exceptional case.

		System.out.println("Three");
		System.out.println("Four");
	}
}