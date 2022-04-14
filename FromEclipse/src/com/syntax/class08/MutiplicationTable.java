package com.syntax.class08;

public class MutiplicationTable {

	public static void main(String[] args) {
		int num = 3;
		int result;
		for (int i = 1; i <= 10; i++) {
			result = num * 1;
			System.out.println(num + "x" + i + " = " + result);
		}
		System.out.println("------------------------");

		for (int i = 0; i <= 10; i += 3) {
			System.out.println(i + " ");
		}

		System.out.println("-------look it again-----------------");
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			sum += i;
			System.out.println(sum);
		}

		System.out.println("-------look it again syso out site of {}-------------");
		int sum1 = 0;
		for (int i = 1; i <= 5; i++) {
			sum1 += i;

		}
		System.out.println(sum1);
		
		System.out.println("-------look it again-----------------");
		int sum2 = 0;
		for (int i = 1; i <4; i++) {
			sum2 *= i;
			System.out.println(sum2);
		}
		
	}

}
