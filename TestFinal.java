package com.test.finalTest;

class TestFinal {
	// Declaration of final instance variable. 
	 final int x;

	TestFinal() {
		// Initialization of final variable in the constructor. 
		x = 20;
	}
	
	public static void main(String args[]) {
		TestFinal t = new TestFinal();
		System.out.println(" x = " + t.x);
		
		//t.x = 25;
		
		//System.out.println(" x = " + t.x);
	}
}