package com.training.basics;

public class Reverse {
	public static void main(String[] args) {
		int number = 156;
		int rev = 0;
		while (number > 0) {
			rev = number % 10;
			System.out.print(rev);
			number /= 10;

		}
	}

}
