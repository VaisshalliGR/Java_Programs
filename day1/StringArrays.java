package com.java.day1;

public class StringArrays {
	public void display()
	{
		String[] castOfMovie = new String[] {	
				"Jackie Chan", "Tom Cruise", "Arnold",
				"Matt Leblanc", "Emma Watson", "Gal gadot"
		};
			
		for(String s : castOfMovie)
		{
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		StringArrays str = new StringArrays();
		str.display();
	}
}
