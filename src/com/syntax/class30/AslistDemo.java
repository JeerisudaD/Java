package com.syntax.class30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AslistDemo {
    public static void main(String[] args) {
        int[]arr={10,20,30};
        int[]arr2= new int[5];
        arr2[0]=5;
        arr2[1]=15;
        arr2[2]=25;
        arr2[3]=35;
        arr2[4]=45;

        List<Integer> list = Arrays.asList(10,20,30);
        System.out.println(list);
        //list.add(40);//it is not supported if we create lists using Arrays.asList

        List<Integer>list2= new ArrayList<>(Arrays.asList(10,20,30));// at least you will be wasting twice memory
        list2.add(40);
        System.out.println(list2);

        // show .asList ว่าไม่ควรใช้ too many limited เพราะไม่สามารถแอด ข้อมูลได้ และยังใช้ หน่วยความจพเปลืองมาก
        // แนะนำให้ add element line by line

    }
}
