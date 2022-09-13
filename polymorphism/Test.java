package com.technoelevate.polymorphism;

public class Test {

	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		int add=calculator.add(10, 7);
		int add2 = calculator.add(10, 20, 30);  //method overloading
		System.out.println(add);
		System.out.println(add2);
	}

}
