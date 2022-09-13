package com.technoelevate.exception.customeexception;

public class Customer {
	private String name;
	private double bal;
	
public Customer(String name, double bal) {
		super();
		this.name = name;
		this.bal = bal;
	}



public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getBal() {
	return bal;
}
public void setBal(double bal) {
	this.bal = bal;
}

}
