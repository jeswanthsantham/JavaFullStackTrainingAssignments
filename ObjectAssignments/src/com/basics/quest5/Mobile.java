package com.basics.quest5;

public class Mobile {
	
//	5.Write a program to print the mobiles and its details 
//	class Mobile 
//	∙Has properties as model,brand,color  
//	∙Has parameterized constructor 
//	∙Has method void getDetails() to print the details . 
//	class MobileMain 
//	∙Has PSVM  - Create 5 mobile objects as given below 
//	    Mobile mobile1 = new Mobile(“a”,”a”,29000); 
//	∙Add to a mobileArray as given below  
//	Mobile [] mobileArray = new Mobile[5]; 
//	mobileArray[0]=mobile1;  
//	∙Use another for loop, iterate the mobileArray and call getDetails() 
//	method to print each object 
//	∙Use another for loop,iterate the mobileArray and print the mobiles that 
//	has the brand as Samsung 
	
	String model;
	String brand;
	String color;
	
	public Mobile() {
		super();
	}

	public Mobile(String model) {
		super();
		this.model = model;
	}

	public Mobile(String model, String brand) {
		super();
		this.model = model;
		this.brand = brand;
	}

	public Mobile(String model, String brand, String color) {
		super();
		this.model = model;
		this.brand = brand;
		this.color = color;
	}
	
	void getDetails() {
		System.out.println("Model :"+this.model+" Brand :"+this.brand+" Color :"+this.color);
	}
	
	
	

}
