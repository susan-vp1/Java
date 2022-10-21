package com.javaprg.exception;

public class Prg_9_UncheckedException {
	public static void main(String[] args) {
		int x[] = { 1, 2, 3, 4 };
		/*Here, an array contains only 4 elements, but we will try to * display the
		  value of 6th element. It should throw - ArrayIndexOutOfBoundsException */
		System.out.println(x[6]);
	}
}
