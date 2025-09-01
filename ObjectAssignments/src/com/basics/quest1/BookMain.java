package com.basics.quest1;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Book book = new Book("Java", "James",750,"Education");
        book.getDetails();
        book.checkBookType();
        Book book1 = new Book();
        book1.getDetails();
        book1.checkBookType();
        
        Book book2 = new Book("Js");
        book2.checkBookType();
        book2.getDetails();
        
        
        
	}

}

