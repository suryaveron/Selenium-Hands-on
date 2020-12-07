package com.synechron.java.basic.vairables;

public class VariablesDemo {
	
	int a = 10;
	int b = 20;
	static int c = 30;
	
	public static void main(String[] args) {
		// data_type variable_name = value ;
		VariablesDemo vd = new VariablesDemo();
		vd.test1();
		vd.test2();
		System.out.println("Sum of two numbers is : " + (vd.a+vd.b));
		System.out.println("Accessing static member : " + c);
		
	}
	
	
	public void test1()
	{
		int a =100;
		System.out.println(" --- test1 started ----");
		System.out.println("Printing value of a : " + a);
		System.out.println("Printing Global value of a : " + this.a);
		System.out.println("---  test1 ended ----");
	}
	
	public void test2()
	{
		System.out.println(" --- test2 started ----");
		System.out.println("Printing value of a : " + a);
		System.out.println("Printing value of b : " + b);
		System.out.println("---  test2 ended ----");
	}
	
	
}
