package com.syntax.class30;

import java.util.Map;
import java.util.TreeMap;

public class Task4Tester {
    public static void main(String[] args) {
        TreeMap<String, Person> personTreeMap = new TreeMap<>();
        personTreeMap.put("a", new Person("DDD", "Makmak", 32, 200000));
        personTreeMap.put("b", new Person("EEE", "Talok", 32, 200000));
        personTreeMap.put("c", new Person("FFF", "Pheeba", 32, 200000));
        personTreeMap.put("d", new Person("HHH", "Narak", 32, 200000));

        for (Map.Entry<String, Person> p : personTreeMap.entrySet()) {
            System.out.println(p);
        }
    }
}
