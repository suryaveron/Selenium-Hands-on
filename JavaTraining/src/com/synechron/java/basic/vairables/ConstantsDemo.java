package com.synechron.java.basic.vairables;

public class ConstantsDemo {

	String name;
	String state;
	static final String country = "India";
	public static void main(String[] args) {
		
		ConstantsDemo cd1 = new ConstantsDemo();
		ConstantsDemo cd2 = new ConstantsDemo();
		
		cd1.name = "AHB";
		cd1.state = "KA";
		//cd1.country = "AUSTRILA";
		cd2.name = "KHH";
		cd2.state = "PU";
		
		System.out.println(cd1.name);
		System.out.println(cd1.state);
		System.out.println(cd1.country);
		
		System.out.println(cd2.name);
		System.out.println(cd2.state);
		System.out.println(cd2.country);
		
	}
}
