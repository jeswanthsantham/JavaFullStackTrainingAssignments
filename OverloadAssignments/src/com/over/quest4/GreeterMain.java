package com.over.quest4;

public class GreeterMain {

	public static void main(String[] args) {
      Greeter greet = new Greeter("Sai");
      greet.greetUser("welcome","Great day");
      greet.greetUser("Good Day","Have Tea","Enjoy Learning");
      
      Greeter greet1 = new Greeter();
      greet1.sayHello("Sai","Ram");
      greet1.sayHello("Sara","Anna","Reena","Rohan");
      greet1.sayHello("Jo","Roni");

      }

}
