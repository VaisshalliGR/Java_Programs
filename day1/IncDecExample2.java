package com.java.day1;

public class IncDecExample2 {
	public static void main(String[] args) {
		int i = 5;
		int j = i++ + ++i + --i;
		System.out.println("i : "+i+"\n"+"j : "+j);
	}
}
