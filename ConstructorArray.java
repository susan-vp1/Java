package com.javaConstructor.example;

public class ConstructorArray {
	ConstructorArray() {
		System.out.println("Hello Java");
	}

	public static void main(String[] args) {
		// Create an array object.
		ConstructorArray[] h = new ConstructorArray[4];
		for (int i = 0; i < h.length; i++) {
			h[i] = new ConstructorArray();
		}
	}
}