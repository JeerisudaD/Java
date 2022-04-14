package com.syntax.class31;

import java.util.LinkedHashSet;

public class Task2 {
    //Create the collection that will store single unique Objects of a String type
// in which order is preserved.
//Write a logic to concatenate all string from the collection.
    public static void main(String[] args) {
        LinkedHashSet<String> drinks = new LinkedHashSet<>();
        drinks.add("Coke");
        drinks.add("Bubble tea");
        drinks.add("Vodka");
        drinks.add("Tea");
        drinks.add("Margarita");
        drinks.add("Ginger ale");

        StringBuilder allDrinks = new StringBuilder();
        for(String drink: drinks){

        }
        System.out.println(allDrinks);
    }
}
