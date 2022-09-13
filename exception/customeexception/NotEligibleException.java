package com.technoelevate.exception.customeexception;

@SuppressWarnings("serial")
public class NotEligibleException extends Exception {
	
    public NotEligibleException(String msg) {
		super(msg);
	}
}
