package com.test.staticVariable;

public class StaticVariableTest {
	// Instance area.
	int a = 10; // Instance variable.
	static int b = 30; // Static variable
	// Declare an instance method. 

	void m1() {
		// We can call instance variable directly from instance area without any object reference variable. 
		System.out.println(a); // Call static variable directly from instance area.
		System.out.println(b);
	}

	static void m2() {
	// Static area. 
	// We cannot call instance member from static area. 
		System.out.println(b); // Here, compile time error because at this time, the object of the class is not
								// created. so we cannot call the instance variable using object reference
								// variable.
	}

	public static void main(String[] args) {
		// Static area.
		StaticVariableTest t = new StaticVariableTest(); // Object creation.
		t.m1(); // Here, we can call instance member using object reference variable t in the
				// static area.
		System.out.println(t.a);
		m2();
	}
}