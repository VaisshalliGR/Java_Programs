package com.java.day1;

import java.util.Scanner;

public class IsPrime {
	public void check(int n)
	{
		boolean flag = true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0) {
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Prime number");
		}else {
			System.out.println("Composite Number");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value:");
		int n = sc.nextInt();
		IsPrime ip = new IsPrime();
		ip.check(n);
	}
}
