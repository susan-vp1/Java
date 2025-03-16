package com.java.practice;

import java.util.Arrays;

public class AnagramCheck {
	public static void main(String args[]) {
		String str1 = "silent";
		String str2 = "listen";
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		boolean isAnagram = Arrays.equals(arr1, arr2);
		System.out.println("Are " + str1 + " and " + str2 + " anagrams? " + isAnagram);
	}
}
