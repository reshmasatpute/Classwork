//Q)3

package com.technoelevate.array.assignment;

import java.util.Scanner;

public class IntArray {
	public void array(int length) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter array elements:");
		int a[]=new int[length];
		for (int i = 0; i < a.length; i++) {
			a[i]=scanner.nextInt();
		}
		int b[];
		if (a.length>=2) {
			b=new int[2];
		}else {
			b=new int[1];
		}
		
		for (int i = 0; i < b.length; i++) {
			b[i]=a[i];
			System.out.println(b[i]);
		}
		
		scanner.close();
	}
    
     public static void main(String[] args) {
    	 
    	 Scanner scanner=new Scanner(System.in);
		System.out.println("Enter length of an array:");
		int l=scanner.nextInt();
		IntArray intArray=new IntArray();
		intArray.array(l);
		scanner.close();
	}
}
