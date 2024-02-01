package com.java.day2;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int orig_num = num;
        int rev = 0;
        while(num>0)
        {
        	int digit = num%10;
        	rev = rev*10+digit;
        	num=num/10;
        }
        if(orig_num == rev)
        {
        	System.out.println("Number is a palindrome");
        }else {
        	System.out.println("Not a palindrome");
        }
	}
}
