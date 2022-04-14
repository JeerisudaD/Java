package com.syntax.class04;

public class PracticeInClass3_DonateBlood {

	public static void main(String[] args) {

		int age = 19;
		double weight = 110.8;

		if (age >= 18) {
			System.out.println("You are is eligible let's check weight");

			if (weight > 110) {
				System.out.println("You are eligible to donate the blood");
			} else {
				System.out.println("Sorry your weight is not eligible to donate");
			}
		} else {
			System.out.println("Thank you for coming, you are not eligible by age. Please come back when you are 18");
		}
	}

}
