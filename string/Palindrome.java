package com.technoelevate.string;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string!!");
		String string = scanner.next();
		String s1 = "";
		for (int i = string.length() - 1; i >=0; i--) {
			s1 = s1 + string.charAt(i);
		}
		if (string.equals(s1)) {
			System.out.println(string + " is Palindrome!!");
		} else 
			System.out.println(string + " is NOT Palindrome!!");
		scanner.close();
	}
}
