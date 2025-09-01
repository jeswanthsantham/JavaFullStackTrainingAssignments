package com.training.basics;

public class Greater {
	public static void main(String[] args) {
		int[] nums = { 10,11, 5, 7, 9 };

		int large = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > large) {
				large = nums[i];
			}
		}

		System.out.println("Greatest number in an array is :" + large);
	}

}
