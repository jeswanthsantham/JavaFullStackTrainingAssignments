package com.basics.quest1;

public class Book {
	String title;
	String author;
	double price;
	String category;
	
	public Book() {
		title="Oracle";
		author="abcd";
		price=450;
		category="new tech";
		
				
	}

	public Book(String title) {
		super();
		this.title = title;
	}
	

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}


	public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}


	public Book(String title, String author, double price, String category) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.category = category;
	}
	
	void getDetails() {
		System.out.println("Title :"+ title +"Author :"+ author +"Price :"+price+"Catogory :"+ category); 
	}
	
	void checkBookType() {
		if(price>500) {
			System.out.println("Premium Book");
		}else
		{
			System.out.println("Standard Book");
		}
	}

}
