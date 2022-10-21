package com.javaprg.exception;

public class Prg_6_DefaultExceptionHandling {
	public static void main(String[] args) {
		m1(); // main() method calling m1().
	}

	public static void m1() {
		m2(); // m1() method calling m2().
		System.out.println(1 / 0); // Exceptional case. A number cannot be divided by zero.
	}

	public static void m2() {
		System.out.println("Hello");
	}
}