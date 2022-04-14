package com.syntax.homework;

import java.util.Scanner;

public class HWClass06_01 {

	public static void main(String[] args) {
		/*
		 * 1. Allow user to enter grade (A, B, or C etc...) and then provide
		 * explanation: A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not
		 * Acceptable. "At the end your program should print which grade was entered by
		 * a user with explanation.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your grade using uppercase");
		char grade = input.next().charAt(0);

		String explanation;

		switch (grade) {
		case 'A':
			explanation = "Excellent";
			break;
		case 'B':
			explanation = "Good";
			break;
		case 'C':
			explanation = "Average";
			break;
		case 'D':
			explanation = "Bad";
			break;
		default:
			explanation = "Not Acceptable";
		}
		System.out.println("Your grade is " + grade + ". You are " + explanation + "!!!");
		input.close();
	}
}
