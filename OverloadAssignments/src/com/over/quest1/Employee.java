package com.over.quest1;

public class Employee {
	/**
	1.Calculate bonus of different employees using method overloading using a method 
	calcBonus(double allowance)  
	class Employee 
	∙Has name, designation as instance variable 
	∙Has parameterised constructor 
	∙Create 3 overloaded methods as  
	ovoid calcBonus(double basicAllowance){// add simple print stmts} 
	ovoid calcBonus(double basicAllowance, String gift){// add simple print 
	stmts} 
	ovoid calcBonus(double basicAllowance, String gift , double 
	houseAllowance){// add simple print stmts} 
	class OverloadMain 
	∙Get user input for employee name and designation as Manager, 
	programmer, Director.  
	∙Create 5 employee objects. Add the objects to an employee array 
	∙Based on the designation call the appropriate calcBonus method 
	∙If the input for designation is Programmer call method with one 
	argument(basicAllowance) 
	∙If the input for designation is Manager, call method with 2 
	arguments(basicAllowance,gift) 
	∙If the input for designation is Director call method with 3 
	argumemts(basicAllowance,gift,housingAllowance) 
	 
	-------------------------------------------------------------------------------------------------------
	-------- 
	 
*/
	String name;
	String designation;
	
	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}
	
	void calcBonus(double basicAllowance) {
		System.out.println("Bounus for Programmer");
		
		}
	
	void calcBonus(double basicAllowance, String gift , double houseAllowance) {
		System.out.println("Bounus for Director");
	}
	void calcBonus(double basicAllowance, String gift) {
		System.out.println("Bounus for Manager");
	}
   
	void getDetails() {
		System.out.println("Name :"+name+" Designation :"+ designation);
	}
}
