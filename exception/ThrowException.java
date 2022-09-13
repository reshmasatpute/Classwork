package com.technoelevate.exception;

public class ThrowException {
    public static void main(String[] args) {
	System.out.println("Program start:");
	try {
		throw new Exception();
	}catch (Exception e) {
		System.out.println("checked exception handled:");
	}
	try {
		throw new RuntimeException();
	}
	catch (Exception e) {
		System.out.println("Exception handled:");
	}
	System.out.println("program end:");
 }
}
