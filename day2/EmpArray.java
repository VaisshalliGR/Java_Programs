package com.java.day2;

public class EmpArray {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.empno =1;
		e1.name = "Rachel";
		e1.basic = 84823;
		
		Employee e2 = new Employee();
		e2.empno =2;
		e2.name = "Ross";
		e2.basic = 90042;
		
		
		Employee e3 = new Employee();
		e3.empno = 3;
		e3.name = "Tom";
		e3.basic = 88344;
		
		
		Employee e4 = new Employee();
		e4.empno = 4;
		e4.name = "Jackie";
		e4.basic = 90455;
		
		Employee[] arr = new Employee[] {
			e1, e2, e3, e4	
		};
		
		for (Employee employ : arr) {
			System.out.println("Employ No " +employ.empno);
			System.out.println("Employ Name  " +employ.name);
			System.out.println("Basic  " +employ.basic);
			System.out.println("------------------------------");
		}
	}
}
