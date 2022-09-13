package com.technoelevate.exception.customeexception;

public class Bank {
	
    public void withDraw(double bal) {
    	Customer customer=new Customer("Reshma",500);
    	
    	if (bal>customer.getBal()) {
			throw new InSufficientBalanceException("Insufficient balance:");
		} else {
        System.out.println("Withdraw successfully!!!");
        
		}
    }
    public static void main(String[] args) {
		Bank bank=new Bank();
		bank.withDraw(1000);
	}
}
