package com.technoelevate.abstraction;

public class Owner {
    public static void main(String[] args) {
		RotWiller rotWiller=new RotWiller("Julie", "Reshu");
		rotWiller.bark();
		rotWiller.eat();
		rotWiller.poop();
		
		GermanSphered germanSphered=new GermanSphered("Denis", "Soni");
		germanSphered.bark();
		germanSphered.eat();
		germanSphered.poop();
	}
}
