package com.syntax.class09;

public class Array {

	public static void main(String[] args) {

		double[]price =new double[4];
		price[0]=0.99;
		price[1]=1.99;
		price[2]=2.99;
		price[3]=9.99;
		
		System.out.println((price[0]+price[1]+price[2]+price[3])/4);
	
		System.out.println("-------------------- ");
		System.out.println();
	
		//I want to create an array of colors;
		String[] colors = {"blue","pink","orange","black"};
		System.out.println("I like "+colors[3]);
		
	
	}

}
