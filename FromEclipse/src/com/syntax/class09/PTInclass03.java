package com.syntax.class09;

public class PTInclass03 {

	public static void main(String[] args) {
		//Create an array of words: Java, Saturday, day, coding
				String[] word= {"Java","Saturday","day","coding"};
				System.out.println(word[1]+" is "+word[0]+" "+word[3]+" "+word[2]);
				System.out.println("-------------");
				
				
				String[] word1 = new String[4];
				word1[0]="Java";
				word1[1]="Saturday";
				word1[2]="day";
				word1[3]="coding";
				System.out.println(word1[1]+" is "+word1[0]+" "+word1[3]+" "+word1[2]);
				
				for(String word2:word1) {
					System.out.print(word2+" ");
				}
				
	}

}
