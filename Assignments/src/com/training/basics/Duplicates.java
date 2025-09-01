package com.training.basics;

public class Duplicates {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 5, 7, 3, 2, 7 };
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					System.out.print(nums[i] + " ");
					break;
				}

			}
		}
		System.out.println();

	}

}
