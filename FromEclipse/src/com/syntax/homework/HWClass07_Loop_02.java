package com.syntax.homework;

public class HWClass07_Loop_02 {

	public static void main(String[] args) {
		// TODO Auto-generate//print even numbers from 20 to 1 (2 ways)
		System.out.println("---- option1-----");

		int c = 20;
		while (c >= 2) {
			System.out.print(c + " ");
			c -= 2;
		}
		System.out.println();
		System.out.println("---- option2-----");

		int d = 20;
		do {
			if (d % 2 == 0) {
				System.out.print(d + " ");
			}
			d--;
		} while (d >= 1);
	}
}
