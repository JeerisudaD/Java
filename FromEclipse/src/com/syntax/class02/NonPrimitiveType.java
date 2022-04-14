package com.syntax.class02;

public class NonPrimitiveType {

	public static void main(String[] args) {
		String greeting ="Hello Everyone";
		String name = "Jeerisuda";
		String lastName=" Dumpathik";
		int age = 38;

	//syso+ctrl+sapce-->autocomplete print statement
	/*using + we can concatenate
	 * String+String
	 * String+int
	 * String+bolean
	 * String+double,char etc..
	 */
	// Jeerisu is 38 years old
	
	System.out.println(greeting);
	System.out.println(name+lastName+" is "+age+" years old");
	
	String feeling=" like";
	String food = " kebab";
	System.out.println("I"+feeling+food);
	
	feeling="love";
	food="shrimp";
	System.out.println("I "+feeling+" "+food);

	System.out.println(food);
	
	}

}
