package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
//main+ctr+space 
//ctr+space-->>autocomplete
		
		int i = 10;
		//widening or implicit
		//we store int value 10 inside double variable
		
		double d = 10;
		
		System.out.println(i);// 10
		System.out.println(d);// 10.0

		// narrowing or explicit casting
		// we store double value 10.99 into int variable
		// int num =10.99;// Type mismatch: cannot convert from double to int
		
		int num=(int)10.99;
		System.out.println(num);

		
		float f = 10.99f;//Type mismatch: cannot convert from double to float
		
		System.out.println(f);
		
		byte b=(byte)128;
		System.out.println(b);
		
		
	}

}
