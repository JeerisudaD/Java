package com.syntax.class07;

public class LoopDemo2 {

	public static void main(String[] args) {

		// task I ant to print only even number from 1 to 30

		int a = 2;
		while (a <= 30) {
			System.out.print(a + " ");
			a += 2;
		}
		System.out.println();

		System.out.println("-----------------------");

		int b = 1;
		while (b <= 30) {
			if (b % 2 == 0) {
				System.out.print(b + " ");
			}
			b++;
		}

	}
}
