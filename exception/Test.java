package com.technoelevate.exception;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int res=0;
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		try{
			res=a/b;
			int []x= {10,2,3,4,14,15};
			System.out.println(x[res]);
		}catch (ArithmeticException e) {
			System.out.println("The denominator is invalid:" );
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The accessing Index value is not present in an array: ");
		}finally {
			scanner.close();
			System.out.println("Scanner is close");
		}
		
		
		
	}
}
