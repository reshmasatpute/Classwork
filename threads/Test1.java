package com.technoelevate.threads;

public class Test1 {
    public static void main(String[] args) {
		Tonique tonique=new Tonique();
		Customer customer=new Customer(tonique, "Bhagwat", "signature");
		Customer customer2=new Customer(tonique, "Mohit", "oak smith gold");
		Customer customer3=new Customer(tonique, "vinayak", "100 pillers");
		customer.start();
		customer2.start();
		customer3.start();
	}
}
