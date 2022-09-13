package com.technoelevate.multithreading.join;

public class GirlFriend extends Thread{
   @Override
   public void run() {
	for (int i = 0; i < 10; i++) {
		System.out.println("Hello I am on the way......"+Thread.currentThread().getName());
	}
}
}
