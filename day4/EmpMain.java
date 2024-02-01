package com.java.day4;

public class EmpMain {
	public static void main(String[] args) {
		
		//Employee eDef = new Employee();
		PTE pteDef = new PTE();
		
		System.out.println("--------------------------------------");
		
		//displaying only super cls props
		Employee supProp = new Employee("Jackie",1,"Hong Kong", 50000);
		supProp.displaySuperProp();
		
		System.out.println("--------------------------------------");
		
		//for displaying name,city, noDays
		PTE pteProp = new PTE("Matt", 2, "Bankok",60000, 20,"Java");
		pteProp.dispSpec();
		
		System.out.println("--------------------------------------");
		
		//for displaying only all subclass details
		PTE pteSub = new PTE("Gal", 3, "Chennai", 90000, 15, "SQL");
        pteSub.displaySubProp();
		
        System.out.println("--------------------------------------");
        
        //displaying all details
        PTE pteAll = new PTE("Emma",4,"Seattle",80000,12,"Js");
        pteAll.displayAll();
	}
}
