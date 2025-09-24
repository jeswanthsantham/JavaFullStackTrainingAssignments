package com.over.quest2;

public class Messenger {

	void sendMail(String message) {
		System.out.println("Hello "+ message);
	}

	void sendMail(String tousername, String message) {
		System.out.println("Welcome " + tousername +" "+ message);
	}

	void sendMail(String tousername, String message, String subject) {
		System.out.println("Thank you " + tousername +" "+ message +" "+ subject);
	}

}
