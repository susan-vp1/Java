package com.javaConstructor.example;

public class Person2 {
	//Declaration of Instance variables. 
	String name;
	int age;
	String address;

	//Declare a default constructor. 
	Person2() {
		//Initialization of values of Instance variables. 
		name = "Vivek";
		age = 25;
		address = "Gandhi Nagar";

		//Print the values on the console. 
		System.out.println(name + " " + age + " " + address);
	}

	//Static method or the main method. 
	public static void main(String[] args) {
		// Create the object of the class using new keyword. 
		Person2 p = new Person2(); // Calling default constructor.
	}
}