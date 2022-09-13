package com.technoelevate.collection.arraylist.myarraylist;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList {
     private Object[] array;
     private int index;
     
     public MyArrayList(){
    	 array=new Object[10];
     }
     
     public int size() {
    	 return index;
     }
     
	public void add(Object obj) {
		if (index>=array.length-1) {
			increaseCapacity();
		}
		array[index]=obj;
		index++;
	}
	private void increaseCapacity() {
		Object[]temp=new  Object[(array.length*3)/2+1];
		for (int i = 0; i < array.length; i++) {
			temp[i]=array[i];
		}
		array=temp;
		
		public Object get(int index) {
			return array[index];
		}
		
	}
	public void remove(Object obj) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(obj)) {
				for (int j = 0; j < array.length; j++) {
					array[j]=array[j+1];
				}
				index--;
				return;
			}
		}
		
	}

	@Override
	public String toString() {
		return "MyArrayList [array=" + Arrays.toString(array) + ", index=" + index + "]";
	}
	
	//implemented class Iterator for create hasnext method.
	class MyItr implements Iterator<Object> {
		int index;

		@Override
		public boolean hasNext() {
			if (array[index]!=null) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			Object object=array[index];
			index++;
			return object;
		}
	}
}
