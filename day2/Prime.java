package com.java.day2;

import java.util.Scanner;

public class Prime {
	public boolean isPrime(int n)
	{
		//this method gets a number as input and return a boolean as true if it is prime else return false
		if(n<2) //0 and 1 are neither prime nor composite
		{
			return false;
		}
		
		
		//we run the loop from 2 to n/2 as for any number n , the number in the range n/2+1 to n will not be divisible anyways
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		//We get lower bound as a and upper bound as b from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lower bound :");
		int a = sc.nextInt();
		System.out.println("Enter upper bound :");
		int b = sc.nextInt();
		
		Prime obj = new Prime();
		/*Now we loop from lower bound a to upper bound b and we pass every number to isPrime method
		isPrime method of return type boolean will check whether the number is prime or noe
		If prime we print the number
		*/
		for(int i=a;i<=b;i++)
		{
			if(obj.isPrime(i))
			{
				System.out.println(i);
			}
		}
	}
}
