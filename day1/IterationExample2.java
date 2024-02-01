package com.java.day1;

public class IterationExample2 {
	public void IterateWithWhile(int n)
	{
		int i=0;
		while(i<n)
		{
			System.out.println("Hello World! This is while loop!!");
			i++;
		}
	}
	public static void main(String[] args) {
		int n = 10;
		IterationExample2 i = new IterationExample2();
		i.IterateWithWhile(n);
		
	}
}
