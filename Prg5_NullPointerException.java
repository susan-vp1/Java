package com.javaprg.exception.example;

public class Prg5_NullPointerException {
	public static void main(String args[]) {
		try {
			String str = null;
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException..");
		}
	}
}
