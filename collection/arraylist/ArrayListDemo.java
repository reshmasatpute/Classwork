package com.technoelevate.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
    	
		ArrayList<Object> arrayList=new ArrayList<>();
		System.out.println(arrayList);
		System.out.println(arrayList.size());
		arrayList.add("Reshu");
		arrayList.add(true);
		arrayList.add(12);
		arrayList.add("Reshu");
		arrayList.add(null);
		//arrayList.iterator();
		System.out.println(arrayList);
		
		System.out.println("=============Using For loop:===============");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		System.out.println("===========Using advanced for loop========= ");
		for(Object obj:arrayList) {
			System.out.println(obj);
		}
		
		System.out.println("======Using Iterator======");
		Iterator<Object> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}
}
