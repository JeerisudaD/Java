package com.syntax.class21;

public class MethodOverLoadingDemo2 {
    void printInfo (String name, int age,double weight){
        System.out.println(name+"" +age+" "+weight);
        System.out.println("M1");
    }
    void printInfo ( int age,String name,double weight){
        System.out.println(name+"" +age+" "+weight);
        System.out.println("M3");
    }
    void printInfo ( int age,double weight,String name){
        System.out.println(name+"" +age+" "+weight);
        System.out.println("M3");
    }
    void printInfo ( double weight,int age,String name) {
        System.out.println(name + "" + age + " " + weight);
        System.out.println("M4");
    }
    public static void main(String[] args) {
        MethodOverLoadingDemo2   metDemo = new MethodOverLoadingDemo2();
    metDemo.printInfo("Gigi",16,121.2);


    }
}
