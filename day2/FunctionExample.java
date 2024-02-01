package com.java.day2;

import java.time.LocalTime;
import java.util.Scanner;

public class FunctionExample {
	public void greetBasedOnTime(LocalTime time) {
		int hour = time.getHour();

        if (hour >= 5 && hour < 12) {
            System.out.println("Good Morning!");
        } else if (hour >= 12 && hour < 17) {
            System.out.println("Good Afternoon!");
        } else if (hour >= 17 && hour < 21) {
            System.out.println("Good Evening!");
        } else {
            System.out.println("Good Night!");
        }
	}
	
	
	public static void main(String[] args) {
		
		LocalTime currentTime = LocalTime.now();
        
		FunctionExample obj = new FunctionExample();
		obj.greetBasedOnTime(currentTime);
	}
} 
