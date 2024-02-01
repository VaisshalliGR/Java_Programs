package com.java.day3;

public class MainEmp {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpId(1);
		emp.setName("Jack");
		emp.setDept("Data Processing");
		emp.setSalary(1000000);
		
		System.out.println(emp.getEmpId()+"\n"+emp.getName()+"\n"+emp.getDept()+"\n"+emp.getSalary());
		
		
		Employee emp1 = new Employee(1,"abc");
		Employee emplo[] = new Employee[4];
		emplo[0] = emp1;
		
		
	}
}
