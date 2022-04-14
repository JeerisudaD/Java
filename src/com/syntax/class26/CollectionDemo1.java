package com.syntax.class26;

import java.util.ArrayList;

public class CollectionDemo1 {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Thailand");// index start =0;
        countries.add("USA");//1
        countries.add("Peru");//2
        countries.add("Korean");//3
        countries.add("Turkey");//4
        countries.add("China");//5
        System.out.println(countries.get(2));// get(index) if we know which element we want to call
        //System.out.println(countries.get(-1));// get error
        //System.out.println(countries.get(6));//out of bound

        System.out.println(countries);
        System.out.println(countries.size());
        countries.size();
        countries.add(3,"Pakistan"); //inserts the elements at this specified index

        countries.add(3,"Iraq"); // add new element between the old element ระบุ index ที่ต้องการ
        //insert the element at this specified index
        System.out.println(countries);
        System.out.println(countries.size());// เช็คว่าใน array มีจำวนทั้งหมดเท่าไหร่

        countries.clear();
        System.out.println(countries);
        System.out.println(countries.size());

        // check the rest of code again

    }

}
