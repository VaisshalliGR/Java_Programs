package com.java.day1;

import java.util.Scanner;

public class ScannerDemo2 {
	public static void main(String[] args) {
		String fName, lName;
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name:");
		fName = sc.next();
		System.out.println("Enter last name:");
		lName = sc.next();
		System.out.println("Enter age :");
		age = sc.nextInt();
		System.out.println(fName+" "+lName+" "+"is "+age+" years young!");
	}
}
