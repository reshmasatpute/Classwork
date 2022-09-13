package com.technoelevate.array;

public class MaxArray {
	public static void main(String[] args) {
		
		int[] a = { 20, 45, 30, 89, 500, 56, 3, 21 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("Maximum number is "+max);
	}
}
