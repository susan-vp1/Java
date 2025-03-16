package com.java.practice;

public class StringReverse {
	public static void main(String args[]) {
		String input = "hello";
		String reversed = new StringBuilder(input).reverse().toString();
		System.out.println(reversed);
	}
}
