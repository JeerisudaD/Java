package com.syntax.class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Task2 {
    //How can you remove all duplicates from the ArrayList

    public static void main(String[] args) {

        List<String> aList = new ArrayList<>();

        aList.add("Jaleh");
        aList.add("Sepideh");
        aList.add("Omid");
        aList.add("Ashkan");
        aList.add("Omid");
        aList.add("Shahla");

        System.out.println("Array List with duplicates: ");
        System.out.println(aList);

        LinkedHashSet<String> aListOfUniqueNames = new LinkedHashSet<>(aList);
        aList.clear();
        aList.addAll(aListOfUniqueNames);

        System.out.println("Array List with no duplicates: ");
        System.out.println(aList);
    }
}
