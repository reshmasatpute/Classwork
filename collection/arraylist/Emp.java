package com.technoelevate.collection.arraylist;

public class Emp implements Comparable<Emp> {
  private String eName;
  private int id;
  private double salary;
  
public Emp(String eName, int id, double salary) {
	super();
	this.eName = eName;
	this.id = id;
	this.salary = salary;
}

public String geteName() {
	return eName;
}
public void seteName(String eName) {
	this.eName = eName;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

@Override
public int compareTo(Emp o) {
	
	return this.id-o.id;    //obj.compareTo(obj1);  -ve mens negative value and +ve means positive value.
}

@Override
public String toString() {
	return "Emp [eName=" + eName + ", id=" + id + ", salary=" + salary + "]";
}

  
}
