package com.basics.quest3;

public class Student {
	String name;
	String department;

	public Student(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}

	void printDetails() {
		System.out.println("Student details are Name: " + name + " Department : " + department);

	}
   void getGrades(int []marks) {
	   int sum=0;
	   int avg=0;
	   String grade;
	   for (int i : marks) {
		   sum +=i;
		}
	   avg=sum/marks.length;
	   if((avg>90)&&(avg<=100)){
		   grade="A";
	   }else if((avg>80)&&(avg<=90)) {
		   grade="B";
	   }else if((avg>70)&&(avg<=80)) {
		   grade="C";
	   }else if((avg>60)&&(avg<=70)) {
		   grade="D";
		   
	   }else if((avg>50)&&(avg<=60)) {
		   grade="E";
		   
	   }else {
		   grade="fail";
	   }
	   
	  System.out.println("Sum: "+sum+" Average: "+avg+" Grade: "+grade);
   }
}
