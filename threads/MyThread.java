package com.technoelevate.threads;

public class MyThread implements Runnable {

	@Override
	public void run() {
		generateOtp();
	}

	public void generateOtp() {
		System.out.println(Math.random()*100000);
		
	}

}
