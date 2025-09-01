package com.training.scan;

import java.util.Scanner;

public class ScanGreater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values of three elements to compare:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int great = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
		System.out.println("The greatest number among " + a + "," + b + " and " + c + " is " + great);
		sc.close();
	}

}
