package com.javaprg.exception;

import java.util.Scanner;

public class Prg_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integer numbers");

		// Read two integer numbers.
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(num1 + "/" + num2 + " = " + (num1 / num2));
	}
}