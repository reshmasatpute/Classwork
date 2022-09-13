package com.technoelevate.collection.arraylist;

import java.util.Comparator;

public class SortingOnName implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		
		return o1.geteName().compareTo(o2.geteName());
	}

}
