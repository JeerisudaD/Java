package com.syntax.homework;

import java.util.Scanner;

public class HWClass06_03 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Is there anything on sale: Yes/No ?");
		String sale = input.next();
		double discount=0;
		double finalPrice=0;

		if (sale.equalsIgnoreCase("yes")) {
			System.out.println("How much is it?");
			double price = input.nextDouble();

		    if (price < 20 && price > 0) {
				discount = 10;
				finalPrice = price - ((price* discount) / 100);

			} else if (price >= 20 && price < 100) {
				discount = 20;
				finalPrice = price - ((price * discount) / 100);

			} else if (price >= 100 && price < 500) {
				discount = 30;
				finalPrice = price - ((price * discount) / 100);

			} else if (price >= 501) {
				discount = 50;
				finalPrice = price - ((price * discount) / 100);
			}
			
			String st1 = "After discout ";
			String st2 = "the price of the item reduce from ";

			System.out.println(st1 + discount + "% " + st2 + price + " to " + finalPrice);

		} else {
			System.out.println(" I am not going for shopping");
		}

		input.close();

	}
}
