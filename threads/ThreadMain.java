package com.technoelevate.threads;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new Test());
		thread.start();
		thread.setName("Rinku");
		thread.setPriority(10);
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i <=10; i++) {
			System.out.println(i + "user1");
			Thread.sleep(2000);
		}
	}
}
