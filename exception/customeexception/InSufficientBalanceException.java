package com.technoelevate.exception.customeexception;

@SuppressWarnings("serial")
public class InSufficientBalanceException extends RuntimeException {
	
	public InSufficientBalanceException(String msg){
		super( msg);
	}
}
