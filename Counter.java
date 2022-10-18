package com.test.staticVariable;

public class Counter {
	static int x = 0; // It will get memory only once and retain its value.

	Counter() {
		x++; // It will increment the static variable by 1 for each object creation.
	}

	void display() {
		System.out.println(x);
	}

	public static void main(String[] args) {
		Counter c1 = new Counter(); //Counter.x = 1  //c1.x
		c1.display();
		Counter c2 = new Counter(); //Counter.x = 2  //c2.x
		c2.display();
		Counter c3 = new Counter(); //Counter.x = 3  //c3.x
		c3.display();
	}
}