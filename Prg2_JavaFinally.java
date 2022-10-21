package com.javaprg.exception2;

class Prg2_JavaFinally {
	public static void main(String args[]) {
		System.out.println(Prg2_JavaFinally.myMethod());
	}

	public static int myMethod() {
		try {
			return 112;
		} finally {
			System.out.println("This is Finally block");
			System.out.println("Finally block ran even after return statement");
		}
	}
}