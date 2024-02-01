package com.java.day2;

import java.util.Scanner;

public class TwoDig {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if(num>=10 && num<=99)
        {
        	System.out.println("Two digit number");
        }else {
        	System.out.println("Not a two digit number");
        }
	}
}
