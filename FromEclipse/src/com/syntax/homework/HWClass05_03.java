package com.syntax.homework;

import java.util.Scanner;

public class HWClass05_03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number between 1-1000");
		int num = input.nextInt();
		String size = null;

		if (num >= 1 && num <= 10) {
			size = "small";
		} else if (num >= 11 && num <= 100) {
			size = "medium";
		} else if (num >= 101 && num <= 1000) {
			size = "large";
		} else {
			size = "Invalid";
		}
		System.out.println(num + " is " + size + " number");

		input.close();
	}

}
