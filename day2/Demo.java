package com.java.day2;

import java.util.Scanner;

public class Demo {
	public double calculateBill(int units)
	{
		double billAmt;
		if (units <= 90) {
			billAmt = units * 1; //If units is less than 90 we multiply with 1
        } else if (units <= 150) {
        	billAmt = 90 * 1 + (units - 90) * 1.5; 
        	/*if units is less than or equal to 150 then we multiple first 90 with 1 and subtract 90 
        	  from from units to get remaining value and multiple with 1.5
        	*/
        } else if (units <= 200) {
        	billAmt = 90 * 1 + 60 * 1.5 + (units - 150) * 2;
        	/*if units is less than or equal to 200 then we multiple first 90 with 1, next 60 with 1.5 and subtract 150 
      	      from from units to get remaining value and multiple with 2
        	 */
        } else if (units <= 240) {
        	billAmt = 90 * 1 + 60 * 1.5 + 50 * 2 + (units - 200) * 2.5;
        	/*if units is less than or equal to 240 then we multiple first 90 with 1, next 60 with 1.5, next 50 with 2 and subtract 200 
    	      from from units to get remaining value and multiple with 2.5
        	 */
        } else {
        	billAmt = 90 * 1 + 60 * 1.5 + 50 * 2 + 40 * 2.5 + (units - 240) * 3;
        }
		return billAmt;
	}
	public static void main(String[] args) {
		 //calculate bill
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the units:");
		int units = sc.nextInt(); //getting units from user
		
		Demo obj = new Demo(); // an object is created for the class Demo to access the public method calculateBill
		double billAmt = obj.calculateBill(units); 
		
		//the calculateBill method will return a double datatype billAmt 
		
		System.out.println("Total bill:"+billAmt);
		


	}
}
