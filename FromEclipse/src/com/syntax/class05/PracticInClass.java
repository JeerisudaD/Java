package com.syntax.class05;

import java.util.Scanner;

public class PracticInClass {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("What is today day?");
	
		String answer=input.nextLine();
		
		if(answer.equals("monday")|| answer.equals("friday")) {
			System.out.println("It is relax day");
			
		}else if (answer.equals("tuseday")|| answer.equals("wednesday")) {
				System.out.println("It is manual class");
		
		}else if (answer.equals("thursday")) {
			System.out.println("It is Java review class");
		
		}else if (answer.equals("satarday")||answer.equals("sunday")) {
			System.out.println("It is Java class");
		}
	else {
			System.out.println("Invalid entry");
		}
		input.close();
	}

}
