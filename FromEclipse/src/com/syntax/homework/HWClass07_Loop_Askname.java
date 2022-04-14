package com.syntax.homework;

import java.util.Scanner;

public class HWClass07_Loop_Askname {

	public static void main(String[] args) {
		String name = null;
		String lastname = null;
		int age = 0;
		for (int i = 1; i <= 5; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("What is your name ?");
			name = sc.next();

			System.out.println("What is your last name ?");
			lastname = sc.next();
			System.out.println("How old are you?");
			age = sc.nextInt();
			System.out.println("You name is " + name + "" + lastname + " and you are " + age + " old");
			sc.close();	
		}
		
	}
	
}
