package com.syntax.homework;

import java.util.Scanner;

public class HWClass05_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("What is to day day ?");
		int day = input.nextInt();

		if (day >= 1 && day <= 5) {
			System.out.println("It is a week day");
		} else if (day == 6 || day == 7) {
			System.out.println("It is a weekend");
		} else {
			System.out.println("Invalid day");
		}
		input.close();
	}

}
