package com.syntax.class08;

public class NestedLoops {

	public static void main(String[] args) {

		for (int a = 1; a <= 3; a++) {
			System.out.println("I am a loop " + a);

			for (int b = 1; b <= 2; b++) {
				System.out.println("I am nested b loop" + b);
			}

		}
		System.out.println();
		System.out.println("-------Car Mileage-----");

		for (int c = 0; c <= 9; c++) {
			
			for (int d = 0; d <= 9; d++) {
				
				for (int f = 0; f <= 9; f++) {
					
					System.out.println(c + " " + d + " " + f);
				}
				System.out.println("---");
			}
		}

	}
}
