package com.java.day1;

import java.util.Scanner;

public class FindFactors {
	public void result(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println("Factor:"+i);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value:");
		int n = sc.nextInt();
		FindFactors fac = new FindFactors();
		fac.result(n);
	}
}	
