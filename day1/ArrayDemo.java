package com.java.day1;

public class ArrayDemo {
	public void displayNum() {
		int[] a = new int[] {10,20,30,40,50};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}
	public static void main(String[] args) {
		ArrayDemo obj = new ArrayDemo();
		obj.displayNum();
	}
}
