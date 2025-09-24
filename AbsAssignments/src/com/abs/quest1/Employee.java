package com.abs.quest1;

public abstract class Employee {
	String empName;
	double salary;
	int empId;

	final String COMPANYNAME = "ABCD";

	public Employee(String empName, double salary, int empId) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.empId = empId;
	}

	void printDetails() {
		System.out.println("Employee Name " + empName + "Salary " + salary + "Employee ID " + empId);
	}
	abstract void calcBonus(double amount);
	String[] showCourses() {
		return new String[] {"Java", "HTML"};
		
	}
	
	abstract void showProjects();
	final void shoeRules() {
		officeHours();
		System.out.println("Leave Policies");
		System.out.println("OD Policies");
		
	}
	
	private void officeHours() {
		System.out.println("14 hours per day");
	}

}
