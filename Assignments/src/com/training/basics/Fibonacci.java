package com.training.basics;

public class Fibonacci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f1=1;
		int f2=2;
		int f3=0;
		int number =100;
		System.out.println("Fibonacci series from 1 to 100:");
		System.out.println(f1);
		System.out.println(f2);
		for(int i=3;i<=number; i++ ) {
			f3=f1+f2;
			if(f3>=100)
				break;
				
			System.out.println(f3);
			f1=f2;
			f2=f3;
		}

	}

}
