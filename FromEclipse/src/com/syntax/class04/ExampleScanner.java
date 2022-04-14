package com.syntax.class04;

import java.util.Scanner;

public class ExampleScanner {

	public static void main(String[] args) {

		Scanner answer =new Scanner(System.in);
		System.out.println("What is your name ?");
		
		String name=answer.nextLine();
		System.out.println(name+" How old are you ?");
		
		int age=answer.nextInt();
		System.out.println(name+ " is "+age+ " years");
		
		answer.close();
		
		
		
	}

}
