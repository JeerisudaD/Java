package com.syntax.class07;

public class LoopDemo {

	public static void main(String[] args) {
		int time = 10;
		while (time < 12) {
			System.out.println("Morning");
			time++;
		}

		System.out.println("*****--------****");

		time = 15;
		while (time > 12) {
			System.out.println("Morning");
			time--;// code will repeat until condition is fault
		}
		System.out.println("End of code");
		System.out.println("*****--------****");
		
		int i=1;
		while(i<=5) {
		System.out.println(i);
		i++;
		}
		System.out.println("The value of i outside of the while loop = "+i);
		System.out.println("The End");
		System.out.println("*****--------****");
		
		// I need to print values from 5 to 20
		int a=5;
		while(a<=20) {
		System.out.println(a);
		a++;
		}
		System.out.println("The End");
		System.out.println("*****--------****");
		
		// I need to print values from 1 to 10 in the same line and add space
		int b=1;
		while(b<=10) {
		System.out.print(b+" ");
		b++;
		}
		System.out.println("The End");
		System.out.println("*****--------****");
		
		// I need to print values from 10 to 1 
		int c=10;
		while(c>=1) {
		System.out.print(c);
		c--;
		}
		System.out.println("*****--------****");
		
		//task I ant to print only even number from 1 to 30
		int num = 1;
		while (num<=20 && num%2==0) {
		System.out.println(num);
		num++;
		}
	}
		
}

