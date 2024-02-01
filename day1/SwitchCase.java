package com.java.day1;

import java.util.*;
import java.util.Scanner;

public class SwitchCase {
	public void menu(int a, int b, int choice)
	{
		switch(choice) {
		case 1:
			System.out.println("result:"+(a+b));
			break;
		case 2:
			System.out.println("result:"+ (a-b));
			break;
		case 3:
			System.out.println("result:"+(a*b));
			break;
		case 4:
			System.out.println("result:"+(a/b));
			break;
		default:
			System.out.println("invalid choice");
			break;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and b values:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter your choice:\n 1. Add\n 2.Subtract\n 3.Multiply\n 4.Divide");
		int choice = sc.nextInt();
		SwitchCase swc = new SwitchCase();
		swc.menu(a,b,choice);
		
	}
}
