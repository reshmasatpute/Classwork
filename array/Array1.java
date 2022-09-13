package com.technoelevate.array;

public class Array1 {
    public static void main(String[] args) {
		int []a= {20,3,9,14,6};
		
		int []b=new int[5];
		for (int i = 0; i < b.length; i++) {
			b[i]=i+1;
			System.out.println(b[i]);
		}
		
		System.out.println(a.length);
		
		
	}
}
