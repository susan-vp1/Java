package com.test.finalTest;

public class FinalVariableTest {
	// Declare a blank final instance variable. 
	final int x;
	// Declare a static blank final variable. 
	final static int a;

	FinalVariableTest() {
		x = 30;
	}

	void displayValue() {
		System.out.println("Value of x: " + x);
	}

	// Declare a static block to initialize the final static variable. 
	static {
		a = 20;
		System.out.println("Value of a: " + a);
	}

	public static void main(String[] args) {
		// Create an object of the class. 
		FinalVariableTest fv = new FinalVariableTest();
		// Call change() method using reference variable fv. 
		fv.displayValue();
	}
}