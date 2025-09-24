package com.over.quest1;

public class OverLoadMain {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Ramesh", "Programmer");
		Employee employee2 = new Employee("Suresh", "Director");
		Employee employee3 = new Employee("Satheesh", "Programmer");
		Employee employee4 = new Employee("Naresh", "Director");
		Employee employee5 = new Employee("Girish", "Manager");

		Employee[] employeeArray = new Employee[5];

		employeeArray[0] = employee1;
		employeeArray[1] = employee2;
		employeeArray[2] = employee3;
		employeeArray[3] = employee4;
		employeeArray[4] = employee5;

		for (Employee employee : employeeArray) {
			employee.getDetails();

			if (employee.designation.equalsIgnoreCase("Programmer")) {

				employee.calcBonus(0);

			}
			else if (employee.designation.equalsIgnoreCase("Maganer")) {
				employee.calcBonus(0, null, 0);

			}
			else if (employee.designation.equalsIgnoreCase("Director")) {
				employee.calcBonus(0, null, 0);

			}

		}

	}

}
