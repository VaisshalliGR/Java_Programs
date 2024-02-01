package com.java.day1;

import java.util.Scanner;

public class BoolDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean status;
		System.out.println("Enter Your Status  ");
		status = sc.nextBoolean();
		if (status==true) {
			System.out.println("Status - 1");
		} else {
			System.out.println("Status - 0");
		}
	}
}
