package com.java.day2;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();

        System.out.println("Perfect numbers in the range " + lowerBound + " to " + upperBound + ":");
        displayPerfectNumbers(lowerBound, upperBound);
    }

    static void displayPerfectNumbers(int lowerBound, int upperBound) {
        for (int number = lowerBound; number <= upperBound; number++) {
            if (isPerfectNumber(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();  // Move to the next line after printing perfect numbers
    }

    static boolean isPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }

        int sum = 1;  // Start with 1 because all numbers are divisible by 1

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

        return sum == num;
    }
}
