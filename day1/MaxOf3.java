package com.java.day1;

import java.util.Scanner;

public class MaxOf3 {
	public void findMax(int a, int b, int c)
	{
		int maxx=a;
		if(maxx<b)
			maxx=b;
		if(maxx<c)
			maxx=c;
		System.out.println(maxx+" is maximum value");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		MaxOf3 maxi = new MaxOf3();
		maxi.findMax(a,b,c);
	}
}		
