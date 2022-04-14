package com.syntax.class02;

public class CreatingVariables {

	public static void main(String[] args) {
		
	/* create a variable and assign value
	 * declare a variable and initialize
	 */
	 // 1 way
		int age=25;
	 
		// 2 way	
		int num;//declare variable
		num=10;//initialize it
		num=100;//reassign the value
		
		int n1, n2, n3; //all 3 variables are on the int type
		n1=10;
		n2=20;
		n3=30;
		
		age=26; //reassigning the value of variable age
		//age=26.5; Error:age variable can hold only int value
	System.out.println(n1);
	
	//Java Rules for identifiers
	//boolean break=false; ERROR-->do not use keyword as identifier (
	//char 1 character='A'; ERROR-->do not start identifier(name) with number
							// or special characters
	//double %value=12.99;ERROR-->
	//Java allows to use _ or $ as identifier
	
	char character1='A';
	boolean enjoy=true;	
	
	/*variable and methods names should start with lower case give variable a meaningful name
	 * class name should start with upper case
	 * if name has 2 or more word-->follow camel casing*/	
	
	System.out.println(age);
	System.out.println(num);
	System.out.println(n1+n2+n3);
	System.out.println(character1);
	System.out.println(enjoy);
	
	
	
	
	}

}
