package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    // Create an arraylist of cars and retrieve all the values using 3 different ways.

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Tesla");
        cars.add("Toyota");
        cars.add("BMW");

        System.out.println("-------1----------");
        System.out.println(cars);

        System.out.println("-------2----------");
        for(String car:cars){
            System.out.println(car);
        }

        System.out.println("-------3----------");
        for(int i = 0; i<cars.size();i++){
            System.out.println(cars.get(i));
        }

        System.out.println("-------4---------");
        int i=0;
        while (i< cars.size()){
            System.out.println(cars.get(i));
            i++;
        }

        System.out.println("-------5---------");
        Iterator<String> iterator =cars.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }



}
