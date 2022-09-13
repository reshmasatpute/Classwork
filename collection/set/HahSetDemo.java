package com.technoelevate.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HahSetDemo {
    public static void main(String[] args) {
		Set<Student> hashSet=new HashSet();
		Student student2=new Student(1,"Sayali","Female");
		Student student3= new Student(1, "Sayali", "female");
		
		hashSet.add(student2);
		hashSet.add(new Student(2, "Vrushabh", "male"));
		hashSet.add(new Student(3, "Surbhi", "female"));
		hashSet.add(student2);
		hashSet.add(student3);
		System.out.println(student2.hashCode()+":::"+student3.hashCode());
		
		Iterator<Student> iterator = hashSet.iterator();
		
		
		while (iterator.hasNext()) {
			Student student = (Student) iterator.next();
			System.out.println(student);
		}
		
		
	}
}
