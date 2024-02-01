package com.java.day2;

import java.util.Scanner;

public class Grade {
	public void displayMsg(char c)
	{
		switch(c) {
		//the cases '1', 'a', 'A' will be checked and if any one case gets satisfied, it will print Grade A
		case '1':
		case 'a':
		case 'A':
			System.out.println("Grade A");
			break;
		//the cases '2', 'b', 'B' will be checked and if any one case gets satisfied, it will print Grade B
		case '2':
		case 'b':
		case 'B':
			System.out.println("Grade B");
			break;
		//the cases '3', 'c', 'C' will be checked and if any one case gets satisfied, it will print Grade C
		case '3':
		case 'c':
		case 'C':
			System.out.println("Grade C");
			break;
		default : 
			System.out.println("Invalid input");
			break;
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Grade:");
		char c = sc.next().charAt(0);
		
		//charAt(0) will fetch the first character of the input and store it in c character
		
		Grade obj = new Grade();
		obj.displayMsg(c); // this calls the displayMsg of void return type

	}
}
