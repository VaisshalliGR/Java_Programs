package com.java.day3;

public class StaticMeth {
	int id;
	String name;
	static String college = "JIT";
	
	static void change()
	{
		college = "JIT - AU";
	}
	
	StaticMeth(int id, String name)
	{
		this.id=id;
		this.name = name;
	}
	
	void display() {
		System.out.println("ID:"+id+"\n"+"Name:"+name+"\n"+"College:"+college);
	}
	public static void main(String[] args) {
		//access static method directly
		StaticMeth.change();
		StaticMeth ob1 = new StaticMeth(1,"Robert");
		StaticMeth ob2 = new StaticMeth(2,"Matt");
		
		ob1.display();
		ob2.display();
	}
}
