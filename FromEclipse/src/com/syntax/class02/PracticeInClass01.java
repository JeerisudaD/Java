package com.syntax.class02;

public class PracticeInClass01 {

	public static void main(String[] args) {
		String name = "Jeerisuda";
		String lastName = "Dumpathik";
		char grade ='A';
		String city="Fort lauderdale";
		String state="Florida";
		long phoneNumber=7867690051l;
		
		System.out.println("My name is "+name+" and my last name is "+lastName+'.');
		System.out.println("I am "+grade+" student.");
	    System.out.println("I live in "+city+", "+state+'.');
	    System.out.println("And my phone number is "+phoneNumber+".");
	
	    city="pensacola";
	    state="Florida";
	    phoneNumber=1231231234;
	    grade='B';
	    System.out.println();
	    System.out.print("My name is "+name+" and I moved to "+city+", "+state+".");
	    System.out.println("My new phone number is "+phoneNumber+'.');		
	    
	}

}
