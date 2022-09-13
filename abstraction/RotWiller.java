package com.technoelevate.abstraction;

public class RotWiller extends Dog {

	public RotWiller(String name, String ownerName) {
		super(name, ownerName);
		
	}

	@Override
	public void bark() {
		System.out.println(name+" is bhow bhow");
		
	}

	@Override
	public void eat() {
		
		System.out.println(name +" is Eating pedigree and Roti!!");
	}

}
