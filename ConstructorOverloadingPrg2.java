package com.javaConstructor.example;

class Employee {
	Employee() {
		System.out.println("Employee Details:");
	}

	Employee(String name) {
		System.out.println("Employee name: " + name);
	}

	Employee(String nCompany, int id) {
		System.out.println("Company name: " + nCompany);
		System.out.println("Employee id: " + id);
	}
}
public class ConstructorOverloadingPrg2 
{ 
 public static void main(String[] args) 
  { 
     Employee emp = new Employee(); 
     Employee emp2 = new Employee("Deep"); 
     Employee emp3 = new Employee("HCL", 12234); 
  } 
}