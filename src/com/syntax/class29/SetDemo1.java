package com.syntax.class29;

import java.util.*;

public class SetDemo1 {
    /* How can you move all duplicates from ArrayList?
     */
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("DD");
        arrayList.add("BB");
        arrayList.add("BB");
        arrayList.add("AA");
        arrayList.add("DD");
        arrayList.add("CC");

        // convert from arraylist to linkHashset
        LinkedHashSet<String> linkHashSet = new LinkedHashSet<>(arrayList);
        System.out.println(linkHashSet);

        //Convert to remove duplicate
        TreeSet<String > treeSet = new TreeSet<>(arrayList);
        System.out.println(treeSet);

        arrayList.clear();//removing all the original elements
        arrayList.addAll(linkHashSet);//add all the unique with the insertion order.
        System.out.println("Array");
        System.out.println(arrayList);

    }
}
