package com.syntax.homework;

public class HWClass09_02 {
	public static void main(String[] args) {

//Create an array of animals and store 5 elements into it. 
//Using 2 different loops print all elements from the array.

		String[] animal = { "Dog", "Cat", "Monkey", "Lion", "Tiger" };
		for (String animals : animal) {
			System.out.print(animals + " ");
		}
		System.out.println();
		for (int i = 0; i < animal.length; i++) {
			System.out.print(animal[i] + " ");
		}
		System.out.println();
		
		int ani = animal.length;
		System.out.println(ani);
	}

}
