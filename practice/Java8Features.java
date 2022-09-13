package com.technoelevate.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Java8Features {

	public static void main(String[] args) {
		
		List<Laptop> asList = Arrays.asList(new Laptop("Dell", "Gray", 35000, "Windows-11"),
				new Laptop("Lenovo", "White", 30000, "Windows-10"), new Laptop("Apple", "Black", 50000, "Apple"),
				new Laptop("HP", "Gray", 35000, "Windows-10"), new Laptop("Dell", "Gray", 35000, "Windows-11"));

		Iterator<Laptop> iterator = asList.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		 asList.stream().distinct(e->)
	}
}
