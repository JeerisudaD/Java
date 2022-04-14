package com.syntax.class18;
public class Task2 {
   // Create a method that will take a String as a parameter and returns reversed String.
    // Method should be available to all classes within your project
    // and accessible by class name also.

    public static String reverseString (String input) {
        StringBuilder stringBuilder = new StringBuilder(input); //object create
        stringBuilder.reverse(); // calling a method on that object
        return stringBuilder.toString();  // return the results

        // prefer create method like following line 14
//---------------------------------------------------------------------------------------
        //return new StringBuilder(input).reverse().toString();
        // code Line 14 ขั้นตอนตามนี้
        //new StringBuilder(input) object creation
        // new StringBuilder(input).reverse() calling a method on that object
        // new StringBuilder(input).reverse().toString() calling two methods on that object
        // calling two methods on that object and returning the results

    }

    public static void main(String[] args) {
        String name = "Jeeri";
        System.out.println(Task2.reverseString(name));

        System.out.println(Task2.reverseString("nook"));
        Task2.reverseString("tai");
    }
    }
