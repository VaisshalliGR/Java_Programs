package com.java.day1;

import java.util.Scanner;

public class CelciusToF {
	public void calculate(double celcius)
	{
		System.out.println("Farhenheit:"+((9*celcius)/5)+32);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Celcius");
		double celcius = sc.nextDouble();
		
		CelciusToF c2f = new CelciusToF();
		c2f.calculate(celcius);
	}
}
