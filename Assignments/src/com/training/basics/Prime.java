package com.training.basics;

public class Prime {
	public static void main(String[] args) {
		int n=100;
		for(int num=2; num<=n; num++) {
			if(isPrime(num)) {
				System.out.print(num + " ");
			}
		}

	}
	
	static boolean isPrime(int number) {
		if(number<=1)return false;
		
		for(int i=2; i*i<=number; i++) {
			if(number %i==0)return false;
		}
		return true;
		
	}

}
