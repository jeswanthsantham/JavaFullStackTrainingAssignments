package com.training.scan;

import java.util.Scanner;

public class ScanSmaller {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values of three elements to compare:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int small = ((a < b) && (a < c)) ? a : ((b < c) ? b : c);
		System.out.println("The smallest number among " + a + "," + b + " and " + c + " is " + small);
		sc.close();
	}

}
