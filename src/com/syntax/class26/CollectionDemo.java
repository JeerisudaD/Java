package com.syntax.class26;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionDemo {
    public static void main(String[] args) {
        String name="Yazgul";
        String name2="Fara";
        //like above --> not scalable if we have to store large amount of data
        //Arrays can be good option to tackle this problem

        String[] names={"Yazgil","Fara"};
        //name[2] = "Jay";

        String []names2 = new String[1000];
        names2[0]= "AA";
        names2[1]="BB";
        System.out.println(Arrays.toString(names2));
        // เราจะสูญเสียหน่วยความจำอีก 998 (execute null in console) ดังนั้น จึงต้องใช้ ArrayList diamond operator

        ArrayList<String> syntaxStudent = new ArrayList<>();
        //ArrayList=> Name of the class
        //<> diamond operator
        //String datatype

        syntaxStudent.add("Gigi"); // add new element inside the Array no need to specify index at the beginning
        syntaxStudent.add("DD");
        syntaxStudent.add("TT");
        // สามารถ add ใน 1 line แต่ more complicate
        System.out.println(syntaxStudent);
        System.out.println(syntaxStudent.isEmpty());



    }
}

