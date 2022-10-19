package com.javaConstructor.example;

public class ConstructorDemo {
	// Declare parameterized constructor with zero argument. 
	ConstructorDemo() {
		System.out.println("Zero argument constructor");
	}

	// Declare parameterized constructor with one argument. 
	ConstructorDemo(int a) {
		System.out.println("One argument constructor");
	}

	// Declare parameterized constructor with two arguments. 
	ConstructorDemo(int a, int b) {
		System.out.println("Two arguments constructor");
	}

	public static void main(String[] args) {
		// Create an object of class. 
		ConstructorDemo d = new ConstructorDemo(); // Calling Default constructor.
		d = new ConstructorDemo(20); // Calling one argument constructor.
		d = new ConstructorDemo(10, 15); // Calling two arguments constructor.
	}
}