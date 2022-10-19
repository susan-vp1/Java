package com.javaConstructor.example;

public class Student1 {
// Declaration of Instance variables. 
	String name;
	String schoolName;
	int std;
	String city;

	public Student1(String name, String schoolName, int std, String city) {
		System.out.println("Constructor called...");
		this.name = name;
		this.schoolName = schoolName;
		this.std = std;
		this.city = city;
	}

	void display() {
		System.out.println(name + " " + schoolName + " " + std + " " + city);
	}

	public static void main(String[] args) {
		Student1 s = new Student1("Ankit", "RSVM", 12, "DHANBAD");
		s.display();
	}
}