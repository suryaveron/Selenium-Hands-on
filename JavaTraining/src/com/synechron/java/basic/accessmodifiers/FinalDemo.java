package com.synechron.java.basic.accessmodifiers;

public class FinalDemo extends StaticDemo {

	static void test1()
	{
		System.out.println("Static test1 method : " + x);
		System.out.println("10 times of PI is " + (PI * 10));
	}
	
	
	public static void main(String[] args) {
		x = 1000;
		test1();
		printPI();
	}
}
