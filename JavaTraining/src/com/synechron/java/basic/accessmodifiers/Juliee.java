package com.synechron.java.basic.accessmodifiers;

public class Juliee extends Dog
{

	
	public void color() {
		System.out.println("White color as always");
	}

	public static void main(String[] args) {
		
		Juliee j = new Juliee();
		//Dog d = new Dog();
		j.eyes();
		j.legs();
		j.color();
	}
}
