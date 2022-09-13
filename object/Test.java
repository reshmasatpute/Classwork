package com.technoelevate.object;

public class Test implements Cloneable{  //test extends Object class.
	
    public static void main(String[] args) throws CloneNotSupportedException {
		Test test=new Test();
		System.out.println(test.getClass());  //This getClass()belong to object class
		
		System.out.println(test.hashCode());  //hashCoce() belong to obj
		Test test2=new Test();
		System.out.println(test2.hashCode());
		 
		Test clone=(Test)test.clone();  //clone()is used to create copy of obj
		 
		
		
		String s="Reshma";
		String s1="Reshu";
		String string=new String("Reshma");
		String string2=new String("Reshma");
		
		System.out.println(string.equals(string2));
		System.out.println(s.equals(s1));
		
		System.out.println(test.equals(test2));
		
		Test test3=null;
		System.gc();   //Garbage collected
		
		
	}
}
