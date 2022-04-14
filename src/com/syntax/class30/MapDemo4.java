package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;

public class MapDemo4 {
    public static void main(String[] args) {

        HashMap<String, Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 105.2);
        fruitMap.put("Orange", 16.5);
        fruitMap.put("Mango", 10.2);
        fruitMap.put("Banana", 12.5);
        fruitMap.put("Lychees", 12.5);

        // getting the iterator from the map with the help of method chaining

        /*first we are getting the set from the map then we are getting
        the iterator on that set
         */
        //เหมือนจะไม่แนะนำให้ใช้อันนี้เพราะมันมีการสร้าง โค้ดซ้ำกันอย฿ ตรง 27-28 ไปฟังคลิปอีกที

        Iterator<String> iterator = fruitMap.keySet().iterator();
        while ((iterator.hasNext())){ // checks if there are still elements left in the iterator
            String key = iterator.next(); //getting the key from the iterator
            Double value =fruitMap.get(key);//getting the corresponding values from the map by passing th keys
            if(key.contains("e")&&value>=20){
                iterator.remove();//if both the conditions are satisfied we remove the element from the map
            }
        }
        System.out.println(fruitMap);
    }
}