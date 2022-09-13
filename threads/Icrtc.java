package com.technoelevate.threads;

public class Icrtc {
    int noOfTickets=100;
    
    public synchronized void bookTickets(String name,int tickets) {
    	System.out.println("welcome to ICRTC "+ name);
    	System.out.println("How may I help you");
    	
    	//We can make block as synchronize.
    	synchronized (this) {
    		if (noOfTickets>tickets) {
    			noOfTickets-=tickets;
    			System.out.println("Thank you for booking!!!!"+tickets+" tickets enjoy your journey... "+ name);
    		}else {
    			System.err.println("Sorry you are late:");
    			return;
    		}
        	System.out.println("Number of tickets left"+noOfTickets);
		}
    	
    }
}
