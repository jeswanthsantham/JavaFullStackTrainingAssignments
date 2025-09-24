package com.abs.quest1;

public class Developer extends TeamLead {
	
	String hobbies[];

	public Developer(String empName, double salary, int empId, String activity, String[] hobbies) {
		super(empName, salary, empId, activity);
		this.hobbies = hobbies;
	}

	@Override
	void funClub() {
		// TODO Auto-generated method stub
		super.funClub();
	}
	void showHobbies() {
		System.out.println("Hobby is "+hobbies);
		
		
	}

}
