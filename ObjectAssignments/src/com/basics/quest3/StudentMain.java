package com.basics.quest3;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student student;
		System.out.println("Please Enter student details:");
		System.out.println("Name : ");
		String name = sc.next();
		System.out.println("Department : ");
		String department = sc.next();
		student = new Student(name, department);

		System.out.println("Enter number of subject exams student attended :");
		int number = sc.nextInt();
		System.out.println("Enter Marks : ");
		int[] marks = new int[number];
		for(int i=0; i<number; i++) {
			marks[i]=sc.nextInt();
		}
		student.printDetails();
		student.getGrades(marks);
		
    sc.close();
	}

}
