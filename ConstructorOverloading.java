package com.javaConstructor.example;

public class ConstructorOverloading {
	//Declare instance Variables. 
	String scName;
	int estYear;

	//Constructor overloading begins from here. 
	//Create default constructor and Initialize values. If you don't initialize values, default values null and 0 will print as output provided by default constructor. 
	ConstructorOverloading() {
		scName = "RSVM";
		estYear = 1975;
	}

	//Create one parameter constructor and set the name of parameter different from name of the variable because we are not using this reference. 
	ConstructorOverloading(String name) {
		scName = name;
	}

	//Create two parameters constructor and set the name of parameters different from name of variables. 
	ConstructorOverloading(String name, int year) {
		scName = name;
		estYear = year;
	}

	//Create an instance method to print output. You can also print output in const. 
	void display() {
		System.out.println(scName + " " + estYear);
	}

	//Main method declaration. 
	public static void main(String[] args) {
		//Create the first object with object reference variable sc. 
		ConstructorOverloading sc = new ConstructorOverloading(); // Calling default constructor.

		//Create second object with object reference variable sc1. 
		ConstructorOverloading sc1 = new ConstructorOverloading("RSVM"); // Calling one parameterized constructor because declaration of an object is
																		 // followed by one argument.

		//Create the third object with object reference variable sc2. 
		ConstructorOverloading sc2 = new ConstructorOverloading("RSVM", 1975); // Calling two parameterized constructor because declaration of an object
												// is followed by two arguments.

		//Now, call methods using reference variables sc, sc1 and sc2 one by one to print output. 
		sc.display();
		sc1.display();
		sc2.display();
	}
}