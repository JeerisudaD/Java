package com.syntax.class21;

public class MethodOverLoadDemo {
    static void add (int num1,int num2){
        System.out.println("M1");
        System.out.println(num1+num2);
    }
    static void add(double num1 , double num2){
        System.out.println("M2");
        System.out.println(num1+num2);
    }
    static void add(String num1 , String num2){
        System.out.println("M3");
        System.out.println(num1+num2);
    }

    public static void main(String[] args) {
        // java จะรู้้ได้ยังงัยว่าเรียน method ไหน โดยดูจาก arguement ที่เรา pass ไปที่ method
        // try to fine best match ถ้าไม่เจอจะดูตัวที่ใกล้สุด โดยการทำ casting

        add(10,11);//call M1 method
        add(10.2, 10);//call M2 method
        add("10","15");// call M3 method


    }
}
