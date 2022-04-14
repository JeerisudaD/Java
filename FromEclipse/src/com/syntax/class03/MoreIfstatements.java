package com.syntax.class03;

public class MoreIfstatements {

	public static void main(String[] args) {
		
		//if temp is more than 45--> I am going for a walk
		//otherwise--> I am staying at home
		
		int temp=45;
		
		if(temp>=45) {
			System.out.println("I am going for a walk");
		}else {
			System.out.println("I am staying at home");	
		}
		
		System.out.println();		
		System.out.println("******** next example********");
		System.out.println();	
		
		String day="Saturday";
		
		if(day.equalsIgnoreCase("saturday")) {
			System.out.println("I am having java class today");	
			System.out.println("I am very excited");
			System.out.println("I am going to have fun with my classmates");
		}
		else {
			System.out.println("I don't know which class I have");
			System.out.println("maybe today is funday");
		}
	}
}
