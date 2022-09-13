package com.technoelevate.inheritance;

public class Owner {
    public static void main(String[] args) {
	SmartPhone smartPhone=new SmartPhone("One plus",50000.0,"Black",64,4);
	System.out.println(smartPhone.color);
	System.out.println(smartPhone.camera);
	System.out.println(smartPhone.ram);
	System.out.println(smartPhone.name);
	System.out.println(smartPhone.price);
	smartPhone.call("Kiran");
	
	Phone phone=smartPhone;
	phone.call("Vaishu");
    }
}
