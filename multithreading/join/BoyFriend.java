package com.technoelevate.multithreading.join;

public class BoyFriend {
	
     public static void main(String[] args) {
		GirlFriend girlFriend = new GirlFriend();
		Thread.currentThread().setName("Sumit");
		girlFriend.setName("Sayali");
		girlFriend.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello come soon baby!!!!  "+Thread.currentThread().getName());
		}
		try {
			girlFriend.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("She reached......");
		System.out.println("They Go together in resorant!!!");
		
	}
}
