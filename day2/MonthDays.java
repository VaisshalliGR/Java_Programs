package com.java.day2;

import java.util.Scanner;

public class MonthDays {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month code (1-12): ");
        int monthCode = scanner.nextInt();

        int daysInMonth;
        switch (monthCode) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                daysInMonth = 31;
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                daysInMonth = 30;
                break;
            case 2: // February
                daysInMonth = 28; 
                break;
            default:
                System.out.println("Invalid month code. Please enter a number between 1 and 12.");
                return;
        }

        // Print the number of days in the month
        System.out.println("Number of days in the month: " + daysInMonth);
    }
}
