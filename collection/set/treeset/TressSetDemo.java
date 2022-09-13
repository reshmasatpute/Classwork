package com.technoelevate.collection.set.treeset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TressSetDemo {
    public static void main(String[] args) {
	Set<Student> treeSet = new TreeSet<>();
	treeSet.add(new Student(4, "Mahira", "Female"));
	treeSet.add(new Student(2, "Kashish", "Female"));
	treeSet.add(new Student(1, "Reshu", "Female"));
	treeSet.add(new Student(4, "Shivaji", "male"));
	
	Iterator<Student> iterator = treeSet.iterator();
	while (iterator.hasNext()) {
		Student student = (Student) iterator.next();
		System.out.println(student);
	}
	}
}
