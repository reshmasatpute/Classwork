/**
 * Program to sort an array elements using bubble sort.
 */

package com.technoelevate.array;

public class SortArray {
	public static void main(String[] args) {

		int[] a = { 76, 20, 100, 3, 89, 23 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[j] = a[i];
					a[j] = temp;
				}
			}
		}
		System.err.println(a[a.length-2]);
	}
}
