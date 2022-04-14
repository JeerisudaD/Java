package com.syntax.class30;

import java.util.*;

public class Task2 {
    /* Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.

     */
    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("Thailand", "Bkk");
        countries.put("Japan", "STokyo");
        countries.put("USA", "Washington DC");
        countries.put("Peru", "Lima");
        System.out.println(countries);

        //part 1  key&value
        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.print(entry.getKey()+" ");
            System.out.println(entry.getValue());
        }

        Iterator<Map.Entry<String,String>> it = countries.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String,String> entry= it.next();
            System.out.println(entry);
        }
        //part two value
        for (String value: countries.values()){
            System.out.println(value);
        }

        Iterator<String> iterator1=countries.values().iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

    }
}
