package com.javaprg.exception.example;

public class Prg3_NumberFormatException {
	public static void main(String args[]) {
		try {
			int num = Integer.parseInt("XYZ");
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("Number format exception occurred");
		}
	}
}
