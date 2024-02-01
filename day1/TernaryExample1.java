package com.java.day1;

import java.util.Scanner;

public class TernaryExample1 {

	public void result(int a, int b, int c)
	{
		int m = (a > b ? ( a > c ? a : c) : ( b > c ? b : c));
		System.out.println(m+" is greater!");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		TernaryExample1 te1 = new TernaryExample1();
		te1.result(a, b, c);
	}
}
