package com.technoelevate.association;

public class VotingMachine {
    public static void main(String[] args) {
		Voter voter=new Voter();
		voter.setVoterId(1234);
		voter.setName("Reshma");
		voter.setAge(2);
		
		Voter voter2=new Voter();
		voter2.setVoterId(12367);
		voter2.setName("Vaishu");
		voter2.setAge(21);
	}
}
