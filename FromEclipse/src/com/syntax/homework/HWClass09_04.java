package com.syntax.homework;

public class HWClass09_04 {

	public static void main(String[] args) {
//From an array of integer elements find the largest number.

		int[] num = { 555, 12, 117, 25, 24, 29, 36, 57, 69, 84, 92, 78 };

		int largest = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] > largest) {
				largest = num[i];
			}
		}
		System.out.println(largest + " is the largest number from an array");

// use enchant loop
		largest = 0;
		for (int nums : num) {
			if (nums > largest) {
				largest = nums;
			}
		}
		System.out.println(largest + " is the largest number from an array");
	}
}
