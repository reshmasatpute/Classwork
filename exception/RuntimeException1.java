package com.technoelevate.exception;

public class RuntimeException1 {
	public void m1() {
		try {
			m2();
		}catch (Exception e) {
			System.out.println("Exception handled");
		}
	}
	
	public void m2() {
		throw new RuntimeException();
	}
	
	
    public static void main(String[] args) {
		System.out.println("Program start:");
		new RuntimeException1().m1();
	}

	
}
