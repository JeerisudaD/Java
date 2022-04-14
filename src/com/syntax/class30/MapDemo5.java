package com.syntax.class30;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo5 {
    public static void main(String[] args) {
        HashMap<String, Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 105.2);
        fruitMap.put("Orange", 16.5);
        fruitMap.put("Mango", 10.2);
        fruitMap.put("Banana", 12.5);
        fruitMap.put("Lychees", 12.5);

        // entry.Set is a box inside we have boxes with keys and values
        // fruitMap.entrySet(); is a box we have boxes with keys and values
        System.out.println(fruitMap.entrySet());
        System.out.println("***********************");

        /// getting the entries aka small box that can contain the keys and values together
        for(Map.Entry<String,Double> entry: fruitMap.entrySet()){
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        //เช็คโน้คจานอีกที
        // ดูว่าต่อเนื่องไป Entry ยังงัย


    }
}
