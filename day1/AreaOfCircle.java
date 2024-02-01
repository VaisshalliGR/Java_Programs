package com.java.day1;

import java.util.Scanner;

public class AreaOfCircle {
	public void calculate(double radius)
	{
		double area = Math.PI * Math.pow(radius, 2);
		double circumference = 2 * 3.14* radius;
		System.out.println("Area of circle:"+ area);
		System.out.println("Circumference:"+circumference);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius");
		double radius = sc.nextDouble();
		
		AreaOfCircle aoc = new AreaOfCircle();
		aoc.calculate(radius);
	}
}
