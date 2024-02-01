package com.java.day2;

public class StrEXample {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		sb.append(" World");
		sb.insert(10, ".......");
		System.out.println(sb);
		sb.delete(10, 20);
		System.out.println(sb);
		sb.replace(10, 15, "HEELO");
		System.out.println(sb);
	}
}
