package com.syntax.class10;

public class PTInclass03 {

	public static void main(String[] args) {
		String[][] titles = new String[2][4];
		titles[0][0] = "Mr";
		titles[0][1] = "Mrs";
		titles[0][2] = "Ms";
		titles[0][3] = "Miss";

		titles[1][0] = "Smith";
		titles[1][1] = "Jordan";
		titles[1][2] = "Jackson";
		titles[1][3] = "Obama";

		System.out.println(titles[0][1] + " " + titles[1][0]);
		System.out.println(titles[0][0] + " " + titles[1][3]);
		System.out.println(titles[0][3] + " " + titles[1][1]);

		for (String[] ti : titles) {
			for (String name : ti) {
				System.out.println(name + " ");
			}

		}
	}
}
