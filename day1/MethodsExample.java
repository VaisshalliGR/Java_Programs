package com.java.day1;

public class MethodsExample {
	public void color()
	{
		System.out.println("The color of the car is Black");
	}
	public void model()
	{
		System.out.println("It is a Mercedes Benz");
	}
	public void features()
	{
		System.out.println("It has 4 wheels");
	}
	public static void main(String[] args) {
		MethodsExample me = new MethodsExample();
		me.model();
		me.color();
		me.features();
	}

}
