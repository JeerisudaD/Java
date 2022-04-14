package com.syntax.class04;

public class Allergy {

	public static void main(String[] args) {

		boolean allergy = true;

		if (allergy) {
			System.out.println("Let's check what allergies you have ");
			String allType = "pollen";

			if (allType.equals("pollen")) {
				System.out.println("what is med you take?");
			}
		} else {
			System.out.println("You are lucky");
		}

	}

}
