package com.java.day2;

public class BoxingDemo {
	public static void main(String[] args) {
		int a = 12;
		String str = "Hello";
		double abc = 12345;
		
		//boxing imple
		
		Object ob1 = a;
		Object ob2 = str;
		Object ob3 = abc;
		
		//unboxing imple
		
		int a1 = (Integer)ob1;
		String s1 = (String)ob2;
		double b1 = (Double)ob3;
		
		System.out.println(a1+" "+s1+" "+b1);
	}
}
