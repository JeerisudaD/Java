package com.syntax.class10;

public class PTInclass02 {

	public static void main(String[] args) {
// Create an array of countries. While retrieving all values from an array 
//print capital for each country
		String[] Countries = { "Thailand", "Korean", "USA" };
		String capital=null;

		for (int g=0;g<Countries.length;g++) {
			switch ((Countries[g].toLowerCase())) {
			
			case "thailand":
				capital = "Bkk";
				break;
			case "korean":
				capital = "Seoul";
				break;
			case "usa":
				capital = "Washington D.C.";
				break;
				}
				System.out.println("The capital of " + Countries[g] + " is " + capital);
			}
		}

	}


