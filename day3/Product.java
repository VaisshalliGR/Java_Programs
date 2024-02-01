package com.java.day3;

public class Product {
	int id;
	String Name;
	
	public Product(int id, String Name)
	{
		this.id = id;
		this.Name = Name;
	}
	
	public static void main(String[] args) {
		Product prod = new Product(1,"TV");
		
		System.out.println(prod);
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", Name=" + Name + "]";
	}
}
