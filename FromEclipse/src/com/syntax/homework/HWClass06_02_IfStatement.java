package com.syntax.homework;

import java.util.Scanner;

public class HWClass06_02_IfStatement {
	/*
	 * Using scanner class create calculator. Allow user to enter 2 numbers and
	 * operator(+,-,*,/). Based on operator provide the result to user.
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter first numbers");
		double num1 = input.nextDouble();
		System.out.println("Please enter second numbers");
		double num2 = input.nextDouble();

		System.out.println("Please enter operator + , - ,* , / ");
		char operator = input.next().charAt(0);
		double result=0.0;
		
		if (operator == '+') {
			result=num1+num2;
			
		} else if (operator == '-') {
			result=num1-num2;
		
		} else if (operator == '*') {
			result=num1*num2;
		
		} else if (operator == '/') {
			result=num1/num2;
		
		} else {
			System.out.println("Invalid input");
		}
		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		System.out.println(result);
		
		input.close();
	}

}
