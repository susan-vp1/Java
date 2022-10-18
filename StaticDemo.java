package com.test.staticVariable;

public class StaticDemo {
	static int a = 20;
	static int b = 50;
	static int c = 100;
	
	static {
		b = 10;
	}
	StaticDemo() {
		a = 3; // Changed value of variable.
		b=45;
		c=10;
	}
	void m1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c); // It will print 100.
	}
	static void m2() {
		a=10000;
		b= 1000;
		c = 500;
	}
	void m3() {
		a = 100;
		b = 150;
		c = 200;
	}
	public static void main(String[] args) {
		StaticDemo d = new StaticDemo();
		d.m1();
		StaticDemo.m2();
		d.m1();
		d.m3();
		d.m1();
		
	}
}
