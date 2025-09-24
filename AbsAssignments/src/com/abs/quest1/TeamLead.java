package com.abs.quest1;

public abstract class TeamLead extends Manager{

	public TeamLead(String empName, double salary, int empId, String activity) {
		super(empName, salary, empId, activity);
	}

	@Override
	void calcBonus(double amount) {
		super.calcBonus(amount);
	}
	
	void corporateServices() {
		System.out.println("Corporate Services");
	}
	
	

}
