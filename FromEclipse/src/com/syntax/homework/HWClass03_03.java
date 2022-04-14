package com.syntax.homework;

public class HWClass03_03 {
	
	public static void main(String[] args) {
		
	
		int num1 = -9;

		if (num1 >= 0) {
			System.out.println("This number is positive");

		} else {
			System.out.println("This number is negative");
		}

		System.out.println(" ********************* ");

		int num2 = 146;
		int num3 = num2 % 2;

		if (num3 == 0) {
			System.out.println("This " + num2 + " is even");
		} else {
			System.out.println("This " + num2 + " is odd");
		}
	}
}
