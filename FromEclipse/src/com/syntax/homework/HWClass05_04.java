package com.syntax.homework;

import java.util.Scanner;

public class HWClass05_04 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		System.out.println("What time is it (user 24 hour format)");
		int time = input.nextInt();
		String dayTime = null;

		if (time >= 1 && time <= 11) {
			dayTime = "Morning";
			
		} else if (time >= 12 && time <= 15) {
			dayTime = "Afternoon";
			
		} else if (time >= 16 && time <= 20) {
			dayTime = "Evening";
			
		} else if (time >= 21 && time <= 24) {
			dayTime = "Night";
			
		} else {
			dayTime = "Invalid input";
		}
		System.out.println("This is in the " + dayTime);

		input.close();

	}

}
