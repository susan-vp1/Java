package com.javaConstructor.example;

public class Person {
	String name;
	int age;
	String address;

	void display() {
		System.out.println(name + " " + age + " " + address);
	}

	public static void main(String[] args) {
		Person p = new Person();
		p.display();
	}
}