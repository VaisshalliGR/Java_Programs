package com.java.day4;

public class PTE extends Employee{
	int noDays;
	String skill;
	
	public PTE()
	{
		System.out.println("Default cons of PTE class");
	}
	
	public PTE(String name, int empId, String city, double salary, int noDays, String skill ) {
		super(name, empId, city, salary);
		this.noDays = noDays;
		this.skill = skill;
	}
	
	public void displaySubProp() {
		System.out.println("No of Days:"+noDays);
		System.out.println("Skill:"+skill);
	}
	
	public void displayAll() {
		displaySuperProp();
		displaySubProp();
	}
	
	public void dispSpec()
	{
		System.out.println("Name: " + name);
        System.out.println("City: " + city);
		System.out.println("No of Days:"+noDays);
	}
}
