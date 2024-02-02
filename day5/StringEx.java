package com.java.day5;

public class StringEx {
	public static void main(String[] args) {
		String pwd = "abcd";
		String newPwd = "@1234";
		
		String chkPwd = pwd;
		String pwd2 = new String("abcd");
		System.out.println(pwd2==pwd);
		System.out.println(chkPwd.hashCode()+" "+pwd.hashCode());
		
		System.out.println(pwd==chkPwd);
		System.out.println(". operator - "+chkPwd.equals(pwd));
		
		pwd = pwd.concat(newPwd);
		System.out.println(pwd);
		
		//methods
		System.out.println(pwd.charAt(1));
		
		
		
	}
}
