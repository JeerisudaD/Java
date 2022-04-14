package com.syntax.class07;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		System.out.println("----While  check condition before excution--------");
		int num = 1;
		while (num <= 3) {// is more uses than do while
			System.out.println("Hello");// 3 times
			num++;
		}
		System.out.println();
		System.out.println("----Do while check condition after excutio--------");
		int num1 = 1;
		do {
			System.out.println("Hello");
			num1++;
		} while (num1 <= 3);
		
		System.out.println();
		System.out.println("----Do while--------");
		int num2 = 10;
		do {
			System.out.println("Hello");
			num2++;
		} while (num2 <= 3);
		
		System.out.println();
		System.out.println("----I want to print num from 1 to 30 using while--------");
		int num4 = 1;
		while(num4<=30) {
		System.out.print(num4+" ");
		num4++;
		}
		
		System.out.println();
		System.out.println();
		System.out.println("----I want to print num from 1 to 30 using do while--------");
		int num3 = 1;
		do {
			System.out.print(num3+" ");
			num3++;
			
		}while(num3<=30);
		
	}
}
