package com.syntax.class08;

import java.util.Scanner;

public class PTInclass_03 {

	public static void main(String[] args) {
		/*
		 * Create a program that will keep asking user to apply for a credit card. As
		 * soon you get “yes” from a user program should stop asking
		 */

		Scanner sc = new Scanner(System.in);
		String answer;
		do {
			System.out.println("Do you have credit card ?");
			answer = sc.nextLine();
		} while (!answer.equalsIgnoreCase("yes"));
		System.out.println("Congrats");
		sc.close();
	}

}
