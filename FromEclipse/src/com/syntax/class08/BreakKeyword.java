package com.syntax.class08;

public class BreakKeyword {

	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {

			System.out.println("I am code for loop");
			if (i == 2) {
				break;
			}
		}
		System.out.println("End of code");
		System.out.println("------New Example------");

		boolean winter = true;
		int temp = -10;

		while (winter) {
			if (temp == 5) {
				System.out.println("When the temp " + temp + " It is cold");
				break;
			}
			temp += 1;
		}

	}

}
