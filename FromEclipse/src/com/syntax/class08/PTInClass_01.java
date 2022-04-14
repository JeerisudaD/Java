package com.syntax.class08;

public class PTInClass_01 {

	public static void main(String[] args) {
// I want to find out the sum of all even and all odd numbers from the range 1 to 50

		int sumEven = 0;
		int sumOdd = 0;

		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				sumEven = sumEven + i;

			} else {
				sumOdd = sumOdd + i;
			}

		}
		System.out.println("Sum of even numbers = "+sumEven);
		System.out.println("Sum of odd numbers = "+sumOdd);
	}
}