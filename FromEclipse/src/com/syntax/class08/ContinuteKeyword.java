package com.syntax.class08;

public class ContinuteKeyword {

	public static void main(String[] args) {

		for (int i = 1; i <= 7; i++) {

			if (i == 3) {
				continue;// skip current iteration/cycle
			}

			System.out.println("Hello" + i);
			System.out.println("Bye");
		}
// I want to print all number for, 1 to 10 except number 4 and number 7

		for (int i = 1; i <= 10; i++) {

			if (i == 4 || i == 7) {
				continue;
			}
			System.out.print(i + " ");
		}

	}

}
