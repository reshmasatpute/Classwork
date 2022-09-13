package com.technoelevate.association;

public class Voter {
   private String name;
   private int voterId;
   private int age;
   
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getVoterId() {
	return voterId;
}
public void setVoterId(int voterId) {
	this.voterId = voterId;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	if (age>18) {
		this.age = age;
		System.out.println(this.name + " eligible for voting!!!!");
	} else {
       System.out.println(this.name + " not eligible for voting!!");
	}
	
}
   
   
}
