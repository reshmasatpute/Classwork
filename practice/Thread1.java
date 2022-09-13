package com.technoelevate.practice;

public class Thread1 extends Thread {

	@Override
	public void run() {
		System.out.println("jhgejheyueygfe");
	}

	public static void main(String[] args) {
		Thread t = new Thread1();
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("hsefghysefygfe");
		}
	}

}
