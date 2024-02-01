package com.java.day3;

public class StaticVarEx {
	//static variable retains the value if any object changes the existing value
	static int count = 0;
	StaticVarEx(){
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		StaticVarEx ob1 = new StaticVarEx();
		StaticVarEx ob2 = new StaticVarEx();
	}
}
