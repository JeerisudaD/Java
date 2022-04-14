package com.syntax.class04;

public class PracticeInClass_Diploma {

	public static void main(String[] args) {

		boolean diploma = true;
		if (diploma) {
			System.out.println("Congratulations !!");

			String dipType = "degree";

			if (dipType.equals("degree")) {
				System.out.println("What is you gpa score");
			}

			double gpa = 3.1;
			if (gpa >= 3.5) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should have stuidied harder");
			}

		} else {
			System.out.println("Please get a degree");
		}
	}

}
