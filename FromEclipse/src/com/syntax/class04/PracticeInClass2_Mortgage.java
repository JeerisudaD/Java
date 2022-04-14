package com.syntax.class04;

public class PracticeInClass2_Mortgage {

	public static void main(String[] args) {

		double intRate = 3.5;
		int price = 70000;

		if (intRate <= 3.5) {
			System.out.println("I will consider buying");

			if (price > 50000) {
				System.out.println("I will take a loan");
			} else {
				System.out.println("I will pay cash");
			}

		} else {
			System.out.println("I won't buy a house");
		}

	}

}
