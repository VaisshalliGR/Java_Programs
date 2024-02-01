package com.java.day1;

import java.util.Scanner;

public class IfElseLadder {
	public void result(int choice)
	{
		if(choice == 1)
		{
			System.out.println("Waffles");
		}else if (choice == 2)
		{
			System.out.println("Latte");
		}else if ( choice == 3)
		{
			System.out.println("Cake");
		}else if(choice == 4)
		{
			System.out.println("apple pie");
		}else {
			System.out.println("Order not placed! Item not in stock..");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
		
		IfElseLadder abc = new IfElseLadder();
		abc.result(choice);
	}
}
