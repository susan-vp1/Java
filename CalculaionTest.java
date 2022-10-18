package com.test.staticVariable; 

public class CalculaionTest 
{ 
 void addition() 
 { 
	 // Call S.V. using class name. 
    int a = Calculation.x; // Since the returning value is an integer, we will store it by using a variable a of type int. 
    int b = Calculation.y; 
    int c = a + b; 
    System.out.println(c); 
 } 
void subtraction() 
{ 
  int p = Calculation.x; 
  int q = Calculation.y; 
  int r = p - q; 
  System.out.println(r); 
} 
public static void main(String[] args) 
{ 
   CalculaionTest ct = new CalculaionTest(); 
    ct.addition(); 
    ct.subtraction(); 
 } 
}