package com.java.day1;

import java.util.Scanner;

public class ScannerDemo3 {
	public void showDetails(String EmpName, String Dept, float salary) {
		System.out.println("Employee Details: "+"\n"+"Name: "+EmpName+"\n"+"Department: "+Dept+"\n"+"Salary: "+salary);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String EmpName, Dept;
		float salary;
		System.out.println("Enter Employee Name:");
		EmpName = sc.next();
		System.out.println("Enter Department:");
		Dept = sc.next();
		System.out.println("Enter salary");
		salary = sc.nextFloat();
		
		ScannerDemo3 sd3 = new ScannerDemo3();
		sd3.showDetails(EmpName, Dept, salary);
;	}
}
