package com.synechron.java.basic.methods;

public class MethodsWithArguments {
	
	public static void main(String[] args) {
		
		//Creating Object to the Class MethodsDemo
		MethodsWithArguments md1 = new MethodsWithArguments();
		MethodsWithArguments md2 = new MethodsWithArguments();
		
		// Call members of the class
		md1.printmyName();
		md1.printMyDesignation();
		// Call members of the class
		md2.printmyName("Mahesh");
		md2.printMyDesignation("Lead Engineer");
		md2.printmyName("Suresh");
		md2.printMyDesignation("Test Engineer");
		md2.printmyName("Guru");
		md2.printMyDesignation("Dev Engineer");
				
		
	}

	public void printmyName()
	{
		System.out.println("My Name is : Aravinda");
	}
	
	public void printMyDesignation() {
		System.out.println("My Designation is : Software Testing Trainer");
	}
	
	//public void printmyName(String name = "Mahesh")
	public void printmyName(String name)
	{
		System.out.println("My Name is : " + name);
	}
	
	public void printMyDesignation(String designation) {
		System.out.println("My Designation is : " + designation);
	}
}
