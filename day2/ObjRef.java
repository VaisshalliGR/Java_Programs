package com.java.day2;

public class ObjRef {
	int n;
	public static void main(String[] args) {
		ObjRef obj1 = new ObjRef();
		obj1.n = 12;
		System.out.println(obj1.n);
		ObjRef obj2 = obj1;
		obj2.n = 13;
		System.out.println(obj1.n);
		System.out.println(obj2.n);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}
