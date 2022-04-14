package com.syntax.class08;

public class ForLoopsPractice {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {

			System.out.println("Hello " + i);
		}

		System.out.println("   MULTIPLICATION TABLE  ");

		/*
		 * 3 X 1= 3 3 X 2 = 6 3 X 3 =9 3 X =30
		 */

		int num = 7;
		int result;

		for (int i = 1; i <= 10; i++) {
			result = num * i;
			System.out.println(num + " X " + i + " = " + result);
		}

		System.out.println(" -WHAT IS THE OUTPUT- ");

		for (int i = 0; i <= 10; i += 3) {

			System.out.print(i + " ");

		}

		System.out.println(" -WHAT IS THE OUTPUT- ");

		int sum = 0;

		for (int i = 1; i <= 5; i++) {
			sum += i;// sum=sum+i;
			System.out.println(sum);
		}

		System.out.println(" -WHAT IS THE OUTPUT- ");

		int value = 1;

		for (int i = 1; i < 4; i++) {
			value *= i;
		}

		System.out.println(value);

		/*
		 * I want to find out the sum of all even and all odd numbers from the range 1
		 * to 50
		 */

		int sumEven = 0;
		int sumOdd = 0;

		for (int i = 1; i <= 50; i++) {

			if (i % 2 != 0) {
				sumOdd = sumOdd + i;
			} else {
				sumEven = sumEven + i;
			}
		}
		
		System.out.println("The sum of all even numbers = " + sumEven + " and the sum of all odd numbers = " + sumOdd);

		System.out.println("ANOTHER WAY TO FIND SUM OF EVEN AND ODD");

		sum = 0;

		for (int i = 2; i <= 50; i += 2) {
			sum += i;
		}
		System.out.println(sum);

		
		int sum1 = 0;

		for (int i = 1; i <= 50; i += 2) {
			sum1 += i;
		}
		System.out.println(sum1);

	}
}
