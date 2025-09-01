package com.training.basics;

public class Sum {
	public static void main(String[] args) {
		int[] num = { 2, 5, 3, 7, 8, 5, 9 };
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
//		System.out.println("number of elements in an array is: "+ num.length);
		System.out.println("Sum of the given array of elements is :" + sum);
		avg = sum / num.length;
		System.out.println("Average of the given array of elements is :" + avg);

	}

}
