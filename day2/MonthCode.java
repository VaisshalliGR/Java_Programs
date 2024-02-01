package com.java.day2;

import java.util.Scanner;

public class MonthCode {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month code (1-12): ");
        int monthCode = scanner.nextInt();
        
        // Check the month code and print the corresponding month
        if (monthCode == 1) {
            System.out.println("January");
        } else if (monthCode == 2) {
            System.out.println("February");
        } else if (monthCode == 3) {
            System.out.println("March");
        } else if (monthCode == 4) {
            System.out.println("April");
        } else if (monthCode == 5) {
            System.out.println("May");
        } else if (monthCode == 6) {
            System.out.println("June");
        } else if (monthCode == 7) {
            System.out.println("July");
        } else if (monthCode == 8) {
            System.out.println("August");
        } else if (monthCode == 9) {
            System.out.println("September");
        } else if (monthCode == 10) {
            System.out.println("October");
        } else if (monthCode == 11) {
            System.out.println("November");
        } else if (monthCode == 12) {
            System.out.println("December");
        } else {
            System.out.println("Invalid month code. Please enter a number between 1 and 12.");
        }
    }
}
