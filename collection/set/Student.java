package com.technoelevate.collection.set;

import java.util.Objects;

public class Student {
    int id;
    String name;
    String gender;
    
	public Student(int id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(gender, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		Student student=(Student)obj;
		if (this.name.equals(student.name) && this.gender.equals(student.gender) && this.id==student.id) {
			return true;
		}
		return false;
	}
   
	
}
