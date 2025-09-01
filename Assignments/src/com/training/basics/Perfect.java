package com.training.basics;

public class Perfect {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 24;
//		int n = number;
		int sum = 0;
		for (int i = 1; i <= number ; i++) {
			if ((number % i) == 0) {
				sum += i;
			}
		}
		if (sum == number) {
			System.out.println("Given number is perfect number");
		} else {
			System.out.println("Given number is perfect number");
		}

	}

}
