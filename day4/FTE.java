package com.java.day4;

public class FTE extends Employee{
	int id = 1;
	int salary = 100000;
	
	public void submsg()
	{
		System.out.println("Inside sub class FTE");
	}
	
	public void dept() {
		System.out.println("Inside FTE sub class");
	}
	
	public void dispSal()
	{
		System.out.println("Inside Employee Super class");
		System.out.println("salary:"+salary);
	}
}
