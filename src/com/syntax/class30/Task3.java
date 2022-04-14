package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task3 {
        /*Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
         */
        public static void main(String[] args) {
            HashMap<Integer,String> bestbuy = new HashMap<>();
            bestbuy.put(7664847,"Printer");
            bestbuy.put(7874995,"Camera");
            bestbuy.put(7874748,"TV");

            Iterator<Map.Entry<Integer,String >>it =bestbuy.entrySet().iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }

    }
}
