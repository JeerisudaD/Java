package com.syntax.class06;

import java.util.Scanner;

public class PracticInClass_Language {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("What is your country ?");
		String ans = input.nextLine();
		

		switch (ans.toLowerCase()) {

		case "usa":
			ans = "English";
			break;

		default:
			ans = "unknow";
			
		}
		
		input.close();
		
		System.out.println("In" + input + " people speak " + ans);

	}
}
