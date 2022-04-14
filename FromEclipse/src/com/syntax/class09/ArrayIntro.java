package com.syntax.class09;

public class ArrayIntro {
	
	public static void main(String[] args) {
		
		
		//creating an array that holds 4 elements
		int[] numbers=new int[4];
		
		//storing values/element inside an array
		numbers[0]=90;
		numbers[1]=87;
		numbers[2]=89;
		numbers[3]=99;
		
		//print 99
		System.out.println(numbers[3]);
		System.out.println(numbers[3]+numbers[0]);//189
		
		//I want to create an array of countries
		String[] countries=new String[5];
		countries[0]="USA";
		countries[1]="Canada";
		countries[2]="Afghanistan";
		countries[3]="Moldova";
		countries[4]="Morocco";
		//countries[5]="Turkey"; ArrayIndexOutOfBoundsException
		
		//System.out.println(countries[5]); ArrayIndexOutOfBoundsException
		System.out.println(countries[3]+countries[4]);
		
		String[] names=new String[5];
		names[1]="Orsan";
		names[2]="Gulnar";
		names[3]="Zakirullah";
		
		System.out.println(names[1]);//Orsan
		System.out.println("Value in index 4 is ="+names[4]);
		
		names[1]="Daniyar";
		System.out.println(names[1]);
		
		//Create an array to store 4 different prices
		//find an average of how much we spent
		double[] price=new double[4];
		price[0]=0.99;
		price[1]=1.99;
		price[2]=2.99;
		price[3]=3;
		
		double avg=(price[0]+price[1]+price[2]+price[3])/4;
		System.out.println(avg);
	}
}
