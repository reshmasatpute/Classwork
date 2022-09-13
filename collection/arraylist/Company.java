package com.technoelevate.collection.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Company  {
    public static void main(String[] args) {
	ArrayList<Emp> arrayList = new ArrayList<>();
	
	arrayList.add(new Emp("Reshu", 1, 20000.0));
	arrayList.add(new Emp("Vaishnavi", 2, 3000.0));
	arrayList.add(new Emp("Kartik", 3, 134690));
	arrayList.add(new Emp("Kiran", 4, 4500.0));
	
	System.out.println("********On what basic you want to print: **********");
	Scanner scanner=new Scanner(System.in);
	String next=scanner.next();
	
	SortingOnName sortingOnName=new SortingOnName();
	SortingOnSalary sortingOnSalary=new SortingOnSalary();
	
	if (next.equalsIgnoreCase("name")) {
		Collections.sort(arrayList,sortingOnName);
		
	}else if (next.equalsIgnoreCase("salary")) {
		Collections.sort(arrayList,sortingOnSalary);
	}
	
	for (Emp emp:arrayList) {
		System.out.println(emp);
	}
}
}