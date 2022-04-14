package com.syntax.homework;

public class HWClass07_Loop_03 {

	public static void main(String[] args) {

//Print odd numbers between 20 and 50 (2 ways)
		System.out.println("---- option1-----");

		int e = 21;
		while (e < 50) {
			System.out.print(e + " ");
			e += 2;
		}
		System.out.println();
		System.out.println("---- option2-----");

		int f = 20;
		do {
			if (f % 2 != 0) {
				System.out.print(f + " ");
			}
			f++;
		} while (f <= 50);
	}
	}

