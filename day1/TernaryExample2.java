package com.java.day1;

public class TernaryExample2 {
	public void result(int val)
	{
		String res = (val>100) ? "Value exceeded 100" :"Valid entry";
		System.out.println(res);
	}
	public static void main(String[] args) {
		int val = 6;
		TernaryExample2 te2 = new TernaryExample2();
		te2.result(val);
	}
}

