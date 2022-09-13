package com.technoelevate.array;

public class CopyArray {
	public static void main(String[] args) {

		int[] a = { 1, 23, 4, 56, 7, 34, 100 };
		int b[] = new int[a.length - 1];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
			System.out.println(a[i]);
			System.err.println(b[i]);
		}
		
	}
}
