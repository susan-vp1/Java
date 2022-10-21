package com.javaprg.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Prg_7_CheckedException {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Hello Java");
		File file = new File("not_existing_file.txt");
		FileInputStream stream = new FileInputStream(file);
	}
}
