package com.technoelevate.string;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Reshma Ramesh Satpute";
		String string[] = str.split(" ");
		
		for (int i = string.length-1; i >= 0; i--) {
			System.out.println(string[i]);
		}
	}
}
