package com.syntax.class21;

public class SuperDemo1 {
}
class AAA {
    AAA(){
        System.out.println("aa");
    }
}
class BBB extends AAA {
    String name;//a
    BBB(){

    }
    BBB(String name){
        super();
        //this(); //  we can't use this() and super() inside the same constructor
        this.name=name;
    }
    BBB(String name, int num){
    }
}
class Main {
    public static void main(String[] args) {
        new BBB();
        new BBB("ff");
    }
}