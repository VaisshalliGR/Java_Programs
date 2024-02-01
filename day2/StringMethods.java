package com.java.day2;

public class StringMethods {
	public static void main(String[] args) {
		String str = "Hello ! This is java programming";
		
		//length() : finds length of given string
		
		System.out.println("Length of string:"+str.length());
		
		System.out.println("The character o is at : "+str.indexOf('o'));
		
		System.out.println("char at 3rd pos: "+str.charAt(3));
		
		System.out.println("Lower case: "+str.toLowerCase());
		
		System.out.println("Upper case: "+str.toUpperCase());
		
		String s1 = "Rachel", s2 = "green", s3="joey", s4="abc";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
	}
}
