package com.syntax.class10;

public class TwoDArray {

	public static void main(String[] args) {

		int[][]number=new int[3][4];
		//1 row or 1 array
		number[0][0]=10;
		number[0][1]=20;
		number[0][2]=30;
		number[0][3]=40;
		//2 row or second row
		number[1][0]=100;
		number[1][1]=200;
		number[1][2]=300;
		number[1][3]=400;		
		//3 row or third row
		number[2][0]=1000;
		number[2][1]=2000;
		number[2][2]=3000;
		number[2][3]=4000;
		
		System.out.println(number[1][2]);//300
		System.out.println(number[1][3]+number[2][0]);//400+1000=1400
				
		
		
	}

}
