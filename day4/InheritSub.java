package com.java.day4;

public class InheritSub extends InheritSuper {
	int b = 10;
	String dbName = "My SQL";
	
	public void invoke()
	{
		System.out.println("sub class:"+b+" "+dbName);
	}
}
