package com.javaprg.exception.example;

public class Prg4_StringIndexOutOfBoundsException {
	public static void main(String args[]) {
		try {
			String str = "beginnersbook";
			System.out.println(str.length());
			char c = str.charAt(40);
			System.out.println(c);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException.");
		}
	}
}
