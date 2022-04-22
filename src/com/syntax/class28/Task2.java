package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    // Create an arrayList of words. Remove every word that ends with “e”.

    public static void main(String[] args) {
            ArrayList<String> words = new ArrayList<>();
            words.add("drink");
            words.add("walk");
            words.add("invoke");
            words.add("duplicate");
            words.add("cake");

        words.removeIf(s -> s.toLowerCase().endsWith("e")); //advance check name? lamda
        System.out.println(words);


        Iterator<String> iterator = words.iterator();
        while ((iterator.hasNext())){
            if(iterator.next().toLowerCase().endsWith("e")){
                iterator.remove();
            }
        }
        System.out.println(words);


    }
}
