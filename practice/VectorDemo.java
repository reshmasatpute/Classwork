package com.technoelevate.practice;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
     Vector<Object> vector=new Vector<>();
     vector.add(null);
     vector.add("Reshu");
     vector.add("Reshu");
     vector.add(null);
     vector.add(200);
     vector.add('V');
     vector.add(12.09);
     
     
     Iterator<Object> iterator = vector.iterator();
     for (Iterator iterator2 = vector.iterator(); iterator2.hasNext();) {
		Object object = (Object) iterator2.next();
		
	}
     
     System.out.println(vector);
     
     
     
	}
}
