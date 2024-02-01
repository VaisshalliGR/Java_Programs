package com.java.day4;

public class PolyExample {
	int a, b, c, d;
	float e;

	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}

	public void add(int a, int b) {
		System.out.println(a+b);
	}

	public void add(int a, int b, int c, int d) {
		System.out.println(a+b+c+d);
	}
	
	public void add(int a, float e)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		PolyExample ob = new PolyExample();
		ob.add(10, 20);
		ob.add(10, 20.5f);
		ob.add(10, 20, 30);
		ob.add(10, 20, 30, 40);
	}
}
