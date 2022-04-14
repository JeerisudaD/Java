package com.syntax.class03;

public class MoreIfstatements01 {
	public static void main(String[] args) {

		/*
		 * we need to declare a boolean variable hungry yes or no
		 * 
		 * if we are hungry- >> I am going to eat otherwise---> I am going to drink tea
		 */

		boolean hungry = true;

		if (hungry) {
			System.out.println("I am going to eat");
		} else {
			System.out.println("I am going to drink tea");
		}

		System.out.println();
		System.out.println("****** Next example*****");
		System.out.println();

		boolean traffic = true;
		if (traffic) {
			System.out.println("I am coming home late");
		} else {
			System.out.println("NO traffic,I am on time");
		}

		System.out.println();
		System.out.println("****** Next example*****");
		System.out.println();

		/*
		 * define a variable to store a browser if browser is chrome--> we are executing
		 * tests on chrome otherwise ---> I am not executing any test case
		 */

		String browser = "chrome";
		// always use equals to compare 2 string preferable than use ==
		
		if (browser.equalsIgnoreCase("Chrome")) {
			System.out.println("we are executing tests on chrome");
		} else {
			System.out.println("I am not executing any test case");
		}

	}
}
