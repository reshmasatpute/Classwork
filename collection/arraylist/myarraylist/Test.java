package com.technoelevate.collection.arraylist.myarraylist;

public class Test {

	public static void main(String[] args) {
	MyArrayList myArrayList=new MyArrayList();
	myArrayList.add(134);
	myArrayList.add(342);
	myArrayList.add(982);
	myArrayList.add(123);
	myArrayList.add(67);
	myArrayList.add(200);
	myArrayList.add(98);
	myArrayList.add(196);
	myArrayList.add(152);
	myArrayList.add(120);
	System.out.println(myArrayList.size());
	for (int i = 0; i < myArrayList.size(); i++) {
		System.out.println(myArrayList);
	}
	myArrayList.remove(200);
	}
}
