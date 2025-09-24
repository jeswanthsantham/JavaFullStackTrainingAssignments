package com.basics.quest4;

import java.util.Scanner;

public class CourseMain {

	public static void main(String[] args) {
		Training training = new Training();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Trainers:");
		int n = sc.nextInt();
		String[] trainers = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter name of" + i + "Trainer :");
			trainers[i] = sc.next();

		}
		training.showTrainers(trainers);

		String[] courses = training.showCourses();
		for (String course : courses) {
			System.out.println(course);

		}
		sc.close();
	}

}
