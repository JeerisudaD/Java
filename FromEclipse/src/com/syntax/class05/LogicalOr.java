package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		
		String day ="Friday";
		
		if(day.equals("Sunday")||day.equals("Monday")) {	
		System.out.println("I have Java class");
		
		//System.out.println("Code outside of it statement");
		}
		
	Scanner input=new Scanner(System.in);
	System.out.println("What is today day?");
	
	String answer=input.next();
	System.out.println(answer);
	input.close();
	
	}

}
