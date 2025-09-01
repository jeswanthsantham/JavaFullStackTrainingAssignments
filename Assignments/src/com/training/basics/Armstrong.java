package com.training.basics;

public class Armstrong {
	public static void main(String[] args) {
		int number = 153;
		int count = 0;
		int originalnum = number;
		int digits=number;
		int sum = 0;

		while (number != 0) {
			number /= 10;
			count++;
			
		}
		System.out.println(count);
		while (digits > 0) {
			int digit = digits % 10;
			System.out.println(digit);
			sum += Math.pow(digit, count);
			digits /= 10;

		}
		if (sum == originalnum) {
			System.out.println("Given number is Armstrong");

		} else {
			System.out.println("Given number is not Armstrong");

		}
	}
}
