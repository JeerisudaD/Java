package com.syntax.class03;

public class AsgharReviewClass_01 {

	public static void main(String[] args) {
		int price = 10;
		boolean sale = true;
		char gender = 'F';
		double discount = 0.150;
		double finalPrice = 0;

		if (sale) {
			if (gender == 'F') {
				if (price > 5) {
					finalPrice = price - price * discount;
				}
			}
		} else {
			finalPrice = price;
		}
		System.out.println(finalPrice);

		System.out.println("-- more simplier code-------");

		System.out.println("-- use relative operator && instead of nested if-------");
		
		if (sale && gender == 'F' && price > 5) {
			finalPrice = price - price * discount;
		} else {
			finalPrice = price;
		}
		System.out.println(finalPrice);
		
		System.out.println("-- use relative operator || instead of if else iff-------");
		
	}

}
