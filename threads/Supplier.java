package com.technoelevate.threads;

public class Supplier extends Thread {
	Tonique tonique;
	String name;
	String brand;
	
    public Supplier(Tonique tonique, String name) {
		super();
		this.tonique = tonique;
		this.name = name;
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
    public void run() {
    	System.out.println("Supplier:");
    	tonique.reStock(brand, 100);
    }
}
