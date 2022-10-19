package com.javaConstructor.example;

public class Student2 {
// Declaration of Instance variables. 
	String name;
	String schoolName;
	int std;
	String city;

	
	public Student2(String n, String scn, int s, String c) {
		name = n;
		schoolName = scn;
		std = s;
		city = c;
	}

	void display() {
		System.out.println(name + " " + schoolName + " " + std + " " + city);
	}

	public static void main(String[] args) {
		Student2 s = new Student2("Ankit", "RSVM", 12, "DHANBAD");
		s.display();
	}
}