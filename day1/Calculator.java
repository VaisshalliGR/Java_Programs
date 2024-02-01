package com.java.day1;

import java.util.Scanner;

public class Calculator {
	public int sum(int a, int b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public int mult(int a, int b) {
		return a*b;
	}
	public int div(int a, int b)
	{
		return a/b;
	}
	
	public int mod(int a, int b)
	{
		return a%b;
	}
	
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers  ");
		a = sc.nextInt();
		b = sc.nextInt();
		Calculator obj = new Calculator();
		int result = obj.sum(a, b);
		System.out.println("Sum of a and b is  " +result);
		result = obj.sub(a, b);
		System.out.println("Difference of a and b is  " +result);
		result = obj.mult(a, b);
		System.out.println("Product of a and b is  " +result);
		result = obj.div(a,b);
		System.out.println("Division of a and b is "+result);
		result = obj.mod(a,b);
		System.out.println("Remainder of a and b is "+result);
	}
}
