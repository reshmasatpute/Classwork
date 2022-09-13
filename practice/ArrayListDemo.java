package com.technoelevate.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
    ArrayList<Object> arrayList= new ArrayList<>(); 
    arrayList.add(true);
    arrayList.add("Reshu");
    arrayList.add('R');
    arrayList.add(100);
    arrayList.add(12.56);
    arrayList.add(null);
    arrayList.add("Reshu");
    
    arrayList.iterator();
    for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
		Object object = (Object) iterator.next();
		
	}
    
    System.out.println(arrayList);
    
    
	}
}
