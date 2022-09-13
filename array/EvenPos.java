package com.technoelevate.array;

public class EvenPos {
	public static void main(String[] args) {
		
		int a[] = { 12, 3, 4, 45, 67, 9, 0, 56, 4 };
		
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				System.out.println(a[i]);
			}
		}
	}
}
