package com.syntax.homework;

import java.util.Scanner;

public class HWClass05_01 {

	public static void main(String[] args) {

		Scanner answer = new Scanner(System.in);
		System.out.println("How tall are you in inches");
		
		int tall = answer.nextInt();
		String word=null;
		
		if(tall<60) {
			word ="short";
					
		}else if(tall>=60 && tall<72) {
			word="medium";
					
		}else if(tall>72)
			word="tall";
		System.out.println("You are "+word);
		
		answer.close();
	}	
}

