package com.abs.quest1;

public class Manager extends Employee {
	String activity;

	public Manager(String empName, double salary, int empId, String activity) {
		super(empName, salary, empId);
		this.activity = activity;
	}

	@Override
	void printDetails() {
		super.printDetails();
	}

	@Override
	void calcBonus(double amount) {
		System.out.println("Bonus " + amount * 3);

	}

	@Override
	void showProjects() {
		System.out.println("Enterprise project, Mini Project");

	}

	void funClub() {
		System.out.println("Activity " + activity);

	}

}
