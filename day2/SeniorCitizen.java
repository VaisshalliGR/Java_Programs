package com.java.day2;

import java.util.Scanner;

public class SeniorCitizen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		
		if(age>=60)
		{
			System.out.println("You are a Senior citizen");
		}
		else {
			System.out.println("You are not a senior citizen");
		}
	}
}
