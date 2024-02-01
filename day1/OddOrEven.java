package com.java.day1;

import java.util.Scanner;

public class OddOrEven {
	
	public void check(int n)
	{
		if(n%2==0)
		{
			System.out.println("It is Even");
		}else {
			System.out.println("It is Odd");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		
		OddOrEven res = new OddOrEven();
		res.check(n);
	}
}
