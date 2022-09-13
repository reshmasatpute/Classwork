package com.technoelevate.threads;

public class Main {
     public static void main(String[] args) {
	Thread thread = new	Thread(new MyThread());
	thread.start();
	
	Thread thread2 = new	Thread(new MyThread());
	thread2.start();
	
	Thread thread3 = new	Thread(new MyThread());
	thread3.start();
	
	Thread thread4= new	Thread(new MyThread());
	thread4.start();
	}
}
