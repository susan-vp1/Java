package com.abstraction;

public class MyClass 
{ 
 public static void main(String[] args) 
 { 
   Addition a = new Addition(); 
   Subtraction s = new Subtraction(); 
   Multiplication m = new Multiplication(); 
    
    a.calculate(20, 30); 
    s.calculate(10, 5); 
    m.calculate(10, 20); 
  } 
}