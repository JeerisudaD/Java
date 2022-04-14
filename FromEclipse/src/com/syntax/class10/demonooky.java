package com.syntax.class10;

public class demonooky {

	public static void main(String[] args) {
		int[][] numbers = {

				{ 10, 20, 30 }, // 0

				{ 100, 200, 300, 400 }, // 1

				{ 1000, 2000 }// 2
		};

		int sum=0;
		
		for(int[]a:numbers) {
			for(int aa:a) {
				sum+=aa;
				System.out.println(sum);
			}
		}
		
		
	}

}
