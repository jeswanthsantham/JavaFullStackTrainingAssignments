package com.basics.quest2;

public class Bank {
	double balance;

	public Bank(double balance) {
		super();
		this.balance = balance;

	}

	void withdraw(double amount) {
		if (balance < amount) {
			System.out.println("InSufficient Balance");
		} else {
			balance -= amount;
			System.out.println("withdrawed successfully");
		}
	}
	
	void deposit(double amount) {
		System.out.println("Balance before Despositing :"+balance);
		balance +=amount;
		System.out.println("Amount Deposited successfully");
		System.out.println("balance after deposit : "+balance);
	}
	
	double getBalance() {
		return balance;
	}

}
