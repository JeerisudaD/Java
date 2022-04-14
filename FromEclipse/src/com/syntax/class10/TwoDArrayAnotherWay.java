package com.syntax.class10;

public class TwoDArrayAnotherWay {

	public static void main(String[] args) {

		int[][] numbers = { 
				{ 10, 20, 30 ,40}, //0
				{ 100, 200, 300 }, //1
				{ 1000, 2000, 3000 ,4000,6000}//2
					
		};
		int size=numbers.length;//3
		int sizeOf1Array=numbers[0].length;//4
		int sizeOf2Array=numbers[1].length;//3
		int sizeOf3Array=numbers[2].length;//5
		System.out.println(size);
		System.out.println(sizeOf1Array);
		System.out.println(sizeOf2Array);
		System.out.println(sizeOf3Array);
		
	//Retrieving all elements from 2D array
		
		for(int i=0;i<numbers.length;i++) {
			
			for(int j=0;j<numbers[i].length;j++) {
				
				System.out.println(numbers[i][j]);
			}
			
		}
		
		
		System.out.println("-----1-------");
		
	int[] a = {10,20,30,40};
	
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	System.out.println(a[3]);
	System.out.println("------2------");
	
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	System.out.println("-----3-------");
	for(int bb:a) {
		System.out.println(bb);
		
	}
	System.out.println("-----string-------");

	String[]food= {"redbull", "burger", "steak", "fries"};
		for(String americanfood :food) {
		System.out.println(americanfood);
		}
		
		
		System.out.println("-----2Darray------");

		int[][] x = { { 10, 20, 30 ,40},{ 100, 200, 300 }};
						{  //a      ,            //b}
		
        for(int[] num: x) {
        	for(int num2:num) {
        		System.out.println(num2);
        	}
        	
        	}
        }
		
		
	}

}
