package com.training.basics;

public class SortArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 6, 4, 7, 3, 8,100,30,44 };

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					int temp = 0;
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;

				}
			}
		}
		for (int i : nums) {
			System.out.println(i);

		}

	}

}
