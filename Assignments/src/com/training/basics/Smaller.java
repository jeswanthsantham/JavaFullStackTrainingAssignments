package com.training.basics;

public class Smaller {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 10, 11, 5, 7, 9 };

		int small = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < small) {
				small = nums[i];
			}
		}

		System.out.println("Smaller number in an array is :" + small);

	}

}
