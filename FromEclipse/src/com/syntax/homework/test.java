package com.syntax.homework;

public class test {

	public static void main(String[] args) {
		 int[][] a = { 
				    { -5, -2, -3, 7 },
				    { 1, -5, -2, 2 },
				    { 1, -2, 3, -4 } };
		 
		 int size = a.length;
		 int size2 = a[0].length;
		 int size3= 0;
		 
		 System.out.println(size);
		 System.out.println(size2);
		 System.out.println(size3);
		 System.out.println("*--------------*");
		 
			int output = 0;
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {

					if (a[i][j] < 0 && a[i][j] % 2 != 0) {
						output = a[i][j];
					}
				}
				System.out.println(output);
			}
			System.out.println(output);
		}
	
	}