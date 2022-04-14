package com.syntax.homework;

public class HWClass09_01 {
	public static void main(String[] args) {

//1. Create an array of cars and store 6 elements into it. 
//Using 2 different loops print all values from the array.

		String[] car = { "Toyota", "Honda", "Tesla", "BMW", "Ford", "Mazda" };
		for (String car1 : car) {
			System.out.print(car1 + " ");
		}
		System.out.println();
		for (int i = 0; i < car.length; i++) {
			System.out.print(car[i] + " ");
		}
	}
}
