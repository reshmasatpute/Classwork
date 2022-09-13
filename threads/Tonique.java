package com.technoelevate.threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Tonique {
	List<String> brand =  Arrays.asList("old monk", "oak smith gold", "signature");
	int quantity;

	public synchronized void buyTonic(String name, int numberOfBottels) {
		boolean b = brand.stream().anyMatch(x->x.equals((String)name));
		System.out.println(name+","+brand.get(1));
		if (b) {
			System.out.println("Here is your brand!!!!" + name);
			System.out.println("Here are your bottles");
			quantity -= numberOfBottels;
		} else {
			System.err.println("Wait ");
			try {
				this.wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

	public synchronized void reStock(String name, int noOfBootles) {
		HashSet<String> hashSet = new HashSet<>(brand);
		hashSet.add(name);
		ArrayList<String> arrayList = new ArrayList<>();
		brand = arrayList;
		this.quantity += noOfBootles;
		this.notify();

	}
}
