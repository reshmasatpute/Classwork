package com.technoelevate.threads;

public class Tatkal {
    public static void main(String[] args) {
		Thread.currentThread().setPriority(10);
		Icrtc icrtc=new Icrtc();
		User kajal=new User("Kajal", 65, icrtc);
		User chaitanya=new User("Chaitanya", 20, icrtc);
		User mayank= new User("Mayank", 20, icrtc);
		chaitanya.start();
		kajal.start();
		mayank.start();
	}
}
