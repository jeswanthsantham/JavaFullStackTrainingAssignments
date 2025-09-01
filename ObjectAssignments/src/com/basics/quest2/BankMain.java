package com.basics.quest2;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Bank bank = new Bank(50000);
		String choice;
		System.out.println(
				"Please enter the option you are looking for: W for withdraw, D for deposit, B for Balance check");
		choice = sc.next().toUpperCase();

		switch (choice) {
		case "W":
			System.out.println("Please enter the amount to withdraw");
			double amount = sc.nextDouble();
			bank.withdraw(amount);
			break;
		case "D":
			System.out.println("Please enter the amount to deposit");
			double damount = sc.nextDouble();
			bank.deposit(damount);
			break;

		case "B":
			System.out.println("Available bank balance:" + bank.getBalance());
			break;

		default:
			System.out.println("Invalid option");
			break;
		}sc.close();
		
	}
}
