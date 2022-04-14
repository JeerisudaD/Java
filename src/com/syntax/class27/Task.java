package com.syntax.class27;

import java.util.ArrayList;

public class Task {
    public static void main(String[] args) {
        /*Create an ArrayList that will store 5 names into it.
                Find out whether the given ArrayList is empty or not?
                Check whether the specific name is present in an ArrayList or not?
                Find the size of your arrayList and print all values from that
         */
        ArrayList<String> workout = new ArrayList<>();
        workout.add("Upper body");
        workout.add("abb");
        workout.add("Lower body");
        workout.add("Cardio");
        workout.add("Full body");

        System.out.println("Is arraylist empty ? "+workout.isEmpty());
        System.out.println("Full body is present "+workout.contains("Full body"));
        System.out.println("Arraylist size is "+workout.size());
        System.out.println(workout);


    }
}
