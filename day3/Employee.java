package com.java.day3;

public class Employee {
	private int empId;
	private String name;
	private String Dept;
	private int salary;

	
	public Employee(int empId, String name) { 
		this.empId = empId; 
		this.name = name; 
	
	}
	
	public Employee()
	{
		System.out.println("Emp constructor invoked");
	}
	 
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
		
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", Dept=" + Dept + ", salary=" + salary + "]";
	}
	
	
}
