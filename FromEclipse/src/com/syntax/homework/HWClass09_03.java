package com.syntax.homework;

public class HWClass09_03 {
	public static void main(String[] args) {

// Create an array on integers and calculate the sum of all elements in an array

		int[] num = { 5, 12, 17, 25, 24, 29, 36, 57, 69, 84, 92, 78 };
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];// sum+=num[i]
		}
		System.out.println("The sum of all elements in an array " + sum);
		
// use in hand for loop
		sum=0;
		for(int nums:num) {
			sum+=nums;
		}
	System.out.println("The sum of all elements in an array " + sum);
	}

}
