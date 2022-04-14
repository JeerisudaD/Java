package com.syntax.class03;

public class AsgharReviewClass {

	public static void main(String[] args) {

		String userName = "Asghar";
		String pssword = "pass124";
		if (userName.equals("Asghar") && pssword.equals("pass123")) {
			System.out.println("Welcome");
		} else {
			System.out.println("not correct");
		}

		System.out.println("-------------------");
		System.out.println();

		int age = 13;
		if (age >= 13) {
			System.out.println("you can play this game");
		} else {
			System.out.println("you can't play this game");
		}

		System.out.println("-------------------");
		System.out.println();

		boolean flag = true;
		if (flag != true) {
			System.out.println("line1");
		} else {
			System.out.println("line2");
		}

		System.out.println("-------------------");
		System.out.println();

		boolean flag1 = true;
		int num = 10;

		if (flag1 != true || num != 15) {
			System.out.println("line1");
		} else {
			System.out.println("line2");
		}

	}

}
