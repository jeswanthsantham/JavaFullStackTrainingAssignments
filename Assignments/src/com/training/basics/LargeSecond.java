package com.training.basics;

import java.util.Arrays;

public class LargeSecond {
	public static void main(String[] args) {
		int[] nums = { 2, 6, 7, 4, 6, 3 };
		Arrays.sort(nums);
		System.out.println("Second smallest number in an array is " + nums[nums.length - 2]);

	}

}
