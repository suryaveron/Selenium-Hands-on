package com.synechron.java.basic.accessspecifiers.pack3;

import com.synechron.java.basic.accessspecifiers.pack1.A;

public class D {

	public static void main(String[] args) {
		A a = new A();

		//a.test1();
		//a.test2();
		//a.test3();
		a.test4();
		a.publicInt = 1000;
		a.printAllMembers();
	}
}
