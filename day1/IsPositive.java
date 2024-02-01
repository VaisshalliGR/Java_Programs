package com.java.day1;

import java.util.Scanner;

public class IsPositive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		if(n>=0)
		{
			System.out.println("Number is positive!");
		}else {
			System.out.println("Number is negative!");
		}
	}
}
