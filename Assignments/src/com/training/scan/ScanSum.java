package com.training.scan;

import java.util.Scanner;

public class ScanSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of values in an array:");
		int num = sc.nextInt();
		int[] nums = new int[num];
		System.out.println("enter " + num + "elents os an array:");
		for (int i = 0; i < num; i++) {
			nums[i] = sc.nextInt();
		}
		int sum = 0;
		double avg = 0;
		for (int i : nums) {
			sum += i;

		}
		avg = sum / num;
		System.out.println("Sum of the array elements is : " + sum);
		System.out.println("Average of the array elements is : " + avg);
		sc.close();
	}

}
