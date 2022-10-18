package com.test.finalTest;

public class FinalMethodTest extends FinalMethod {

	/*
	 * void show() { // Compile time error because we cannot override the final
	 * method from FinalMethod.
	 * System.out.println("This is the final method of FinalMethodEx class"); }
	 */

	public static void main(String[] args) {
		// Create an object of FinalMethodEx class.
		FinalMethod fm = new FinalMethod();

		// Call final method using reference variable fm.
		fm.show();
	}
}