package com.over.quest4;

public class Greeter {
	/**
	 * 4.Call the methods to print many happy messages for one user and one welcome
	 * message for many users, These methods uses varargs as parameter
	 * 
	 * class Greeter{ String name; // default const, parameterized const
	 * 
	 * void greetUser(String... messages){ // iterate through messages and print
	 * message + name; // here the message varies but name is same } void
	 * sayHello(String... names){ // iterate through names and print "Welcome"+name;
	 * // here the message is same but name varies } class GreeterMain{ Greeter obj
	 * = new Greeter(“Sara”); obj.greetUser("welcome","Great day");
	 * obj.greetUser("Good Day","Have Tea",”Enjoy Learning”);
	 * 
	 * Greeter obj = new Greeter(); obj .sayHello("Sri",”Priya”);
	 * obj.sayHello("Sara","Anna","Reena","Rohan"); obj.sayHello("Jo","Roni"); }
	 */

	String name;

	public Greeter() {
		super();
	}

	public Greeter(String name) {
		super();
		this.name = name;
	}

	void greetUser(String... messages) {

		for (String m : messages) {
			System.out.println(m + this.name);

		}

	}

	void sayHello(String... names) {

		for (String name : names) {
			System.out.println("Welcome " + name);

		}
	}

}
