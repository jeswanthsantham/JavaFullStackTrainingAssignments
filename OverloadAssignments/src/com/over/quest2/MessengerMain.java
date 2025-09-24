package com.over.quest2;

public class MessengerMain {
	public static void main(String[] args) {
		Messenger messenger = new Messenger();
		messenger.sendMail("Manager");
		messenger.sendMail("Programmer", "Happy Holidays");
		messenger.sendMail("Developer", "Weekend", "Welcome");

	}
}
