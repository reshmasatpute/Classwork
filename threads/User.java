package com.technoelevate.threads;

public class User extends Thread {
     String name;
     int noOfTickets;
     Icrtc icrtc;
     
	public User(String name, int noOfTickets, Icrtc icrtc) {
		super();
		this.name = name;
		this.noOfTickets = noOfTickets;
		this.icrtc = icrtc;
	}
    @Override
    public void run() {
    	icrtc.bookTickets(name, noOfTickets);
    } 
}
