package com.technoelevate.association;

public class Office {
    public static void main(String[] args) {
		Emp emp=new Emp();
		emp.empName="Reshma";
		emp.phoneNo=7721824366l;
		emp.empId=2001;
		
	    Address address=new Address();
	    
		address.buildingNo=10;  //employee has address.
		address.landmark="Swami Raghuvendra Temple";
	    address.pincode=413726;
		
		//This address we are giving to property of emp var address.
		emp.address=address;
		
		System.out.println(emp.empName);
		System.out.println(emp.phoneNo);
		System.out.println(emp.empId);
		
		System.out.println(emp.address.buildingNo);
		System.out.println(emp.address.landmark);
		System.out.println(emp.address.pincode);
		
	}
}
