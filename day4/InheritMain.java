package com.java.day4;

public class InheritMain {
	public static void main(String[] args) {
		InheritSuper sup = new InheritSuper();
		InheritSub sub = new InheritSub();
		InheritSupp supp = new InheritSupp();
		InheritSub2 sub2 = new InheritSub2();
		sub2.print();
		sub2.display();
		sup.print();
		sub.print();
		sub.invoke();
		sub.display();
		sup.display();
		
	}
}
