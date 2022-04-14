package com.syntax.class07;

public class ForLoop {

	public static void main(String[] args) {
//initialization
		// condition
		// increment or decrement

		for (int i = 1; i <= 5; i++) {
			System.out.println("hello");
		}

		System.out.println("------ new example---");
		System.out.println("I want to print num from 1 to 20");
		
		for (int b=1; b<=20; b++) {
			System.out.print(b+" ");
		}
		
		System.out.println("------ new example---");
		System.out.println("I want to print num from 10 to 20");
		
		for (int c=10; c<=25; c++) {
			System.out.print(c+" ");
		}
		
		System.out.println("------ new example---");
		System.out.println("I want to print num from 50 to 1");
		
		for (int d=50; d>=1; d--) {
			System.out.print(d+" ");
		}
		
		
	}
}
