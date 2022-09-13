package com.technoelevate.abstraction;

public class GermanSphered extends Dog {

	public GermanSphered(String name, String ownerName) {
		super(name, ownerName);
		
	}

	@Override
	public void bark() {
		System.out.println(name +" is BOO BOO:");
		
	}

	@Override
	public void eat() {
		System.out.println(name +" is Eating pedigree and Milk:");
		
	}

}
