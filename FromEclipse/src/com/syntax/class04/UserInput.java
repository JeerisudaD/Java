
package com.syntax.class04;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {	
		
		Scanner input=new Scanner(System.in); // creating a scanner
		System.out.println("Please enter your name");
		
		// if you want to capture single String --> use next()
		
		String name=input.next();
		
		System.out.println("My name is "+name);
		
		System.out.println(name+" How old are you");
		
		int age=input.nextInt();
		System.out.println(name+" is "+age);
	input.close();
	}

}
