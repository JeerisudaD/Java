package com.syntax.homework;

import java.util.Scanner;

public class HWClass06_02_SwitchCase {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter first numbers");
		double num1 = input.nextDouble();
		System.out.println("Please enter second numbers");
		double num2 = input.nextDouble();

		System.out.println("Please enter operator + , - ,* , / ");
		char operator = input.next().charAt(0);

		double answer = 0;

		switch (operator) {
		case '+':
			answer = num1 + num2;
			break;
		case '-':
			answer = num1 - num2;
			break;
		case '*':
			answer = num1 * num2;
			break;
		case '/':
			answer = num1 / num2;
			break;
		
		}
		System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);
		input.close();
	}

}
