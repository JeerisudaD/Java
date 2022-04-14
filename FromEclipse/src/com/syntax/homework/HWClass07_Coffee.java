package com.syntax.homework;

import java.util.Scanner;

public class HWClass07_Coffee {

	public static void main(String[] args) {

		double price = 3;
		System.out.println("please enter your money");
		Scanner in = new Scanner(System.in);
		double pay;
		do {
			pay = in.nextDouble();
			if (pay > price) {
				System.out.println("Give less");
			} else if (pay < price) {
				System.out.println("Give more");
			}
		} while (pay != price);
		System.out.println("enjoy");
		in.close();
	}
}
