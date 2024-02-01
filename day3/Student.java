package com.java.day3;

public class Student {
	String name;
	int id;
	static String college = "JIT"; //static variable
	
	Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	void display()
	{
		System.out.println("Id:"+id+"\n"+"Name:"+name+"\n"+"College:"+college);
	}
	public static void main(String[] args) {
		Student s1 = new Student(1,"Jackie");
		Student s2 = new Student(2,"Ross");
		
		s1.display();
		s2.display();
	}
	
}
