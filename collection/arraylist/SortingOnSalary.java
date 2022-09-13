package com.technoelevate.collection.arraylist;

import java.util.Comparator;

public class SortingOnSalary implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		
		return o1.getSalary().compareTo(o2.getSalary());
	}

}
