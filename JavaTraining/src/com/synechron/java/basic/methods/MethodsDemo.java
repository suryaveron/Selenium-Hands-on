package com.synechron.java.basic.methods;

public class MethodsDemo {
	
	public static void main(String[] args) {
		
		//Creating Object to the Class MethodsDemo
		MethodsDemo md1 = new MethodsDemo();
		MethodsDemo md2 = new MethodsDemo();
		
		// Call members of the class
		md1.printmyName();
		md1.printMyDesignation();
		// Call members of the class
		md2.printmyName();
		md2.printMyDesignation();
				
		
	}

	public void printmyName()
	{
		System.out.println("My Name is : Aravinda");
	}
	
	public void printMyDesignation() {
		System.out.println("My Designation is : Software Testing Trainer");
	}
}
