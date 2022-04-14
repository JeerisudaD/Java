package com.syntax.class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapDemo3 {
    //want to remove many value
    public static void main(String[] args) {
        HashMap<String, Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 105.2);
        fruitMap.put("Orange", 16.5);
        fruitMap.put("Mango", 10.2);
        fruitMap.put("Banana", 12.5);
        fruitMap.put("Lychees", 12.5);

        Collection<Double> values =fruitMap.values(); // to collect value from map
        //cannot ues Set bc double value will disappear
        System.out.println(values);

        values.removeIf(aDouble -> aDouble >= 20);
        System.out.println(values);
        System.out.println(fruitMap);

        /* Iterator<Double> iterator = values.iterator();
        while (iterator.hasNext()){
        if(iterator.next()>=20){
        iterator.remove();
            }
        }
         */

    }
}