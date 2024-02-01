package com.java.day4;

public class Employee {
	//Super class 
	String name;
	int empId;
	String city;
	double salary;
	
	public Employee() //default cons
	{
		System.out.println("Default constructor of Employee");
	}
	
	public Employee(String name, int empId, String city, double salary) 
	{
		this.name = name;
		this.empId = empId;
		this.city = city;
		this.salary = salary;
	}

	public void displaySuperProp() {
		System.out.println("Name: "+name);
		System.out.println("Emp Id:"+empId);
		System.out.println("City:"+city);
		System.out.println("Salary:"+salary);
	}
	
}	
