package com.java.day2;

public class BoxEmployee {
	public void show(Object ob) {
		String type = ob.getClass().getSimpleName();
		System.out.println(type);
		if (type.equals("Employ")) {
			Employee employ = (Employee)ob;
			System.out.println("Employ No  " +employ.empno);
			System.out.println("Employ Name  " +employ.name);
			System.out.println("Basic   " +employ.basic);
		}
		if (type.equals("Student")) {
			Student student = (Student)ob;
			System.out.println("Student Id  " +student.sid);
			System.out.println("Student Name  "+student.sname);
			System.out.println("City  " +student.city);
			System.out.println("Cgp  " +student.cgp);
		}
	}
	public static void main(String[] args) {
		Employee employ = new Employee();
		employ.empno = 1;
		employ.name = "Rachel";
		employ.basic = 88323;
		
		Student student = new Student();
		student.sid = 1;
		student.sname = "Green";
		student.city = "Chennai";
		student.cgp = 9.2;
		
		BoxEmployee obj = new BoxEmployee();
		obj.show(employ);
		obj.show(student);
	}
}
