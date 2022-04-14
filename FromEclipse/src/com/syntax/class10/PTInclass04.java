package com.syntax.class10;

public class PTInclass04 {

	public static void main(String[] args) {
		String[][] name = { 
				{ "Gigi", "Katy", "Jeanny", "Crispy" }, 
				{ "A", "B", "C", "D", "E" }

		};
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name[i].length; j++) {
				System.out.println(name[i][j]);
			}
		}
		System.out.println();
		System.out.println("------enchan loop-----");

		for (String[] names : name) {
			for (String na : names) {
				System.out.println(na);
			}
		}

	}
}
