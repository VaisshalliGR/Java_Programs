package com.java.day1;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String args[])
	{
		String fName, lName;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name and last name:");
		fName = sc.nextLine();
		lName = sc.nextLine();
		System.out.println(fName+" "+lName);
	}
	
}
