package com.syntax.class07;

import java.util.Scanner;

public class DoLoopExample {

	public static void main(String[] args) {
		/*
		 * create a secret num we want user to guess our secret num ---> my program
		 * should be stop otherwise it should continue asking to guess my number
		 */

		int winNum = 5;
		Scanner sc = new Scanner(System.in);
		int guessNum;

		do {
			System.out.println("Please enter number to win");
			guessNum = sc.nextInt();

		} while (guessNum != winNum);
		System.out.println(" You earn $1000");
	
		System.out.println();
		System.out.println("-----same example but using while-----------");
		
		winNum=10;
		System.out.println("Please enter number to win");
		guessNum = sc.nextInt();
	   
		while(guessNum!=winNum) {
			System.out.println("Please enter number to win");
			guessNum = sc.nextInt();
			   
		}
		System.out.println(" You earn $2000");
		sc.close();
	}

}
