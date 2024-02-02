package com.java.day5;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Example");
		System.out.println(sb);
		sb.append(" for String Buffer");
		sb.reverse();
		System.out.println(sb+" "+sb.capacity());
	}
}
