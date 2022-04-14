package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {

		Scanner nooky = new Scanner(System.in);
		System.out.println("Do you need a loan?");
		boolean answer = nooky.nextBoolean();

		if (answer) {
			System.out.println("What is your credit score");
			int score = nooky.nextInt();
			if (score >= 0) {
			}
			if (score < 600) {
				System.out.println("Not eligible");
			} else if ((600 < score) && (score < 700)) {
				System.out.println("Maybe eligible");
			} else {
				System.out.println("Unknown");

			}
		}
		nooky.close();
	}
}
