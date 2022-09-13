package com.technoelevate.practice;

public class Laptop implements Comparable<Laptop> {
	String brandName;
	String color;
	int prize;
	String os;

	public Laptop(String brandName, String color, int prize, String os) {
		super();
		this.brandName = brandName;
		this.color = color;
		this.prize = prize;
		this.os = os;
	}

	@Override
	public String toString() {
		return "Laptop [brandName=" + brandName + ", color=" + color + ", prize=" + prize + ", os=" + os + "]";
	}

	@Override
	public int compareTo(Laptop o) {
				return this.brandName.compareTo(brandName);
	}

}
