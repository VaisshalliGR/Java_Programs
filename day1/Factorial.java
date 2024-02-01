package com.java.day1;

import java.util.Scanner;

public class Factorial {
	public void CalculateFact(int n)
	{
		int factt = 1;
		for(int i=1;i<=n;i++)
		{
			factt = factt*i;
		}
		System.out.println("Factorial of the given number is:"+factt);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		
		Factorial fact = new Factorial();
		fact.CalculateFact(n);
	}
}	
