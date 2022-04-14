package com.syntax.class04;

public class NestIf {

	public static void main(String[] args) {

		boolean vaccine = false;
		int dose = 2;

		if (vaccine) {
			System.out.println("How many dose you have");

			if (dose == 1) {
				System.out.println("You need another shot");
			} else {
				System.out.println("You are fully vaccinated");
			}

		} else {
			System.out.println("You need to take a shot");
		}
	}

}
