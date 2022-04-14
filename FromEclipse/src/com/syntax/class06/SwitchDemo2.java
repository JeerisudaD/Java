package com.syntax.class06;

public class SwitchDemo2 {

	public static void main(String[] args) {

		char choice = 'N';
		String answer;

		switch (choice) {
		case 'y':
			answer = "Yes";
			break;
		case 'n':
			answer = "No";
			break;
		case 'm':
			answer = "Maybe";
			break;
		default:
			answer = "Unknown";
		}

		System.out.println(answer);

	}

}
