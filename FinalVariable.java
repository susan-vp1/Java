package com.test.finalTest;

public class FinalVariable {
	// Declare a final instance variable. 
	final int a = 20;

	// Declare an instance method. 
	void change() {
		// Change the value of the final instance variable. 
		//a = 40; // compile time error. A final variable's value cannot be changed.
		System.out.println(a);

		// Declare a final local variable inside the method. 
		//final int i = 0;
		int i = 0;
		for (i = 0; i < 5; i++) // compile time error.
		{
			System.out.println("Value of I: " + i);
		}
	}

	public static void main(String[] args) {
		// Create an object of the class.
		FinalVariable fv = new FinalVariable();
		// Call change() method using reference variable fv. 
		fv.change();
	}
}
