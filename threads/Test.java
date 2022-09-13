package com.technoelevate.threads;

public class Test extends Thread{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
		for (int i = 11; i <=20; i++) {
			if (i==14) {
				throw new RuntimeException();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i+"==user2");
		}
	}
	
    public static void main(String[] args) {
		Test test = new Test();
		test.start();
		for (int i = 0; i <=10; i++) {
			System.out.println(i+"==user1");
		}
	}
}
