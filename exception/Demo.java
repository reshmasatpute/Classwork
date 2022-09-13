/**
 * For compile time propogation
 */
package com.technoelevate.exception;

public class Demo {
	public void m1() {
		try {
			m2(1);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public void m2(int number) throws Exception {
		if (number==1) {
			throw new Exception();
		} else {
          System.out.println(number);
		}
		
	}
	
    public static void main(String[] args) {
		new Demo().m1();
		System.out.println("Program end");
	}
}
