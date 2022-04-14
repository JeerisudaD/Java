package Replit;

import java.util.*;

class Main {
    public static void main(String[] args) {
        //step1
        List<Map<String, Object>> dataList = new ArrayList<>();
        //step 2
        Map<String, Object> appleMap = new LinkedHashMap<>();
        appleMap.put("Items", "Apple");
        appleMap.put("Price", "20.00");
        appleMap.put("Quantity", "10");
        //step 3
        dataList.add(appleMap);
        //step 4
        Map<String, Object> orangeMap = new LinkedHashMap<>();
        orangeMap.put("Items", "Orange");
        orangeMap.put("Price", "21.99");
        orangeMap.put("Quantity", "10");
        //step 5
        dataList.add(orangeMap);
        //System.out.println(dataList);
        //step 6

    }
}


    





