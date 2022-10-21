package com.javaprg.exception2;

class InvalidProductException extends Exception {
	public InvalidProductException(String s) {
		// Call constructor of parent Exception
		super(s);
	}
}

public class Prg9_Example1 {
	void productCheck(int weight) throws InvalidProductException {
		if (weight < 100) {
			throw new InvalidProductException("Product Invalid");
		}
	}

	public static void main(String args[]) {
		Prg9_Example1 obj = new Prg9_Example1();
		try {
			obj.productCheck(60);
		} catch (InvalidProductException ex) {
			System.out.println("Caught the exception");
			System.out.println(ex.getMessage());
		}
	}
}