/**
 SORTING HASHSET ELEMENTS:
 */
 

package com.technoelevate.collection.set;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetDemo1 {
   public static void main(String[] args) {
	Set<Integer> hashSet = new HashSet<>();
	hashSet.add(100);
	hashSet.add(20);
	hashSet.add(10);
	hashSet.add(6);
	hashSet.add(14);
	hashSet.add(3213);
	List<Integer> arrayList = new ArrayList<>(hashSet);
	Collections.sort(arrayList);
	Iterator<Integer> iterator = arrayList.iterator();
	//arrayList.remove(2);   CurrentModificationObject:
	
	
	while (iterator.hasNext()) {
		Integer integer=iterator.next();
		System.out.println(integer);
	}
}
}
