package com.technoelevate.inheritance;

public class Phone {
  String name;
  double price;
  String color;
  
 public Phone(String name, double price, String color) {
	super();
	this.name = name;
	this.price = price;
	this.color = color;
}
 public void call(String name) {
	 System.out.println("Calling" +  name);
 }
 
 public void text(String name,String msg ) {
	 System.out.println(name + "is text to"+msg);
 }
  
}
