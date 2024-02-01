package com.java.day2;

import java.util.Scanner;

public class OddOrEv {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if(num%2==0 || num%4==0)
        {
        	System.out.println("Even number");
        }else {
        	System.out.println("Odd number");
        }
	}
}
