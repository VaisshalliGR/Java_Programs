package com.java.day1;

public class CopyArray {
	public static void main(String[] args) {
		String[] castOfMovie = new String[] {	
				"Jackie Chan", "Tom Cruise", "Arnold",
				"Matt Leblanc", "Emma Watson", "Gal gadot"
		};
		String[] copy = castOfMovie;
		for(String s : copy)
		{
			System.out.println(s);
		}
	}
}
