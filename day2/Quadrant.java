package com.java.day2;

import java.util.Scanner;

public class Quadrant {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x coordinate: ");
        int x = scanner.nextInt();
        System.out.print("Enter y coordinate: ");
        int y = scanner.nextInt();
        
        if (x > 0 && y > 0) {
            System.out.println("The point (" + x + ", " + y + ") lies in the first quadrant.");
        } else if (x < 0 && y > 0) {
            System.out.println("The point (" + x + ", " + y + ") lies in the second quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println("The point (" + x + ", " + y + ") lies in the third quadrant.");
        } else if (x > 0 && y < 0) {
            System.out.println("The point (" + x + ", " + y + ") lies in the fourth quadrant.");
        } else if (x == 0 && y == 0) {
            System.out.println("The point (" + x + ", " + y + ") is at the origin.");
        } else {
            System.out.println("The point (" + x + ", " + y + ") lies on an axis.");
        }
	}
}
