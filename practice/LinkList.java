package com.technoelevate.practice;

import java.util.LinkedList;

public class LinkList {
	public static void main(String[] args) {
       LinkedList<Object>linkedList=new LinkedList<>();
       linkedList.add(100);
       linkedList.add(false);
       linkedList.add(null);
       linkedList.add("Vaishu");
       linkedList.add(10.0);
       linkedList.add(100);
       linkedList.add("Vaishu");
       //linkedList.addAll(linkedList);
     
		for (Object object : linkedList) {
			
		}
		System.out.println(linkedList);
	}
}
