package com.technoelevate.abstraction.interfaces;

public class Customer {
    public static void main(String[] args) {
		Casio casio=new Casio();
		System.out.println(casio.add(5, 5));
		System.out.println(casio.substract(50, 30));
		System.out.println(casio.trignometric("sin", "cos"));
	}
}
