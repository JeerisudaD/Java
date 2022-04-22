package Replit;

import java.util.*;

class Main {
    public static void main (String[] args) {
        try {
            int[] a = {1};
            System.out.println(a[0]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.print(e.getClass());
                    e.printStackTrace();
            ;
        }
StringBuilder sb1 = new StringBuilder("hello");
        sb1.append("world");
        System.out.println(sb1);
    }
}


    





