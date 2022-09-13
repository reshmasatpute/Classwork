package com.technoelevate.exception.customeexception;

public class Election {
	public void vote(int age) {
     if (age<18) {
    	 try {
    		 throw new NotEligibleException("Not eligible for vote:") ; 
    	 }catch (NotEligibleException e) {
			e.printStackTrace();
		}
			
		} else {
          System.out.println("Go and vote!!!!!");
		}
	}
	
	
     public static void main(String[] args) {
		Election election=new Election();
		election.vote(12);
		Voter voter=new Voter();
		
	} 
}
