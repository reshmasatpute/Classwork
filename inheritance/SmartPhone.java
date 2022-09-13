package com.technoelevate.inheritance;

public class SmartPhone extends Phone {
 int ram;
 int camera;
 public SmartPhone() {
	super("Nokia",1500.0,"Black");
}
 public SmartPhone(String name,double price,String color,int ram,int camera) {
	 super(name,price,color);
	 this.ram=ram;
	 this.camera=camera;
 }
  
 public void videoCall(String name) {
	 System.out.println("Video calling!!!!"+name);
 }
 
 public void browse() {
	 System.out.println("Browsing");
 }
 
 public void play(String game) {
	 System.out.println("playing" +game);
 }
 
 public void call(String name) {
	 System.out.println(name + "is calling!!!");
 }
  
}
