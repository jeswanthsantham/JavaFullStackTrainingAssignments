package com.basics.quest4;

//Write a program to print the course and the trainer details 
//class Training 
//∙Has method as String[] showCourses() to print and array of course names 
//∙Has method void showTrainers(String…names ) . Iterate through the array and 
//print the name of the trainers 
//class CourseMain 
//∙Has PSVM  - Get input to get the trainers name (to populate the array) 
//and call showTrainers(“Rohan”,”Sathya”) method 
//∙Call showCourses() method. This returns an array. Iterate and print 
//the course names 
public class Training {

	String[] showCourses() {
		String[] courseNames = new String[] { "Java", "Spring", "HTML", "CSS" };
		return courseNames;
	}

	void showTrainers(String... names) {
		System.out.println("Trainers Names :");
		for (String name : names) {
			System.out.println("-" + name);

		}

	}

}
