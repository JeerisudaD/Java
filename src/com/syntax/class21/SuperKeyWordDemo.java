package com.syntax.class21;
public class SuperKeyWordDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.printColor();
        child.printInfo();
        child.print();
    }
}
class GrandParent{
    String color ="blue";
    void printInfo(){
        System.out.println("I am a Grandparent");
    }
}
class Parent extends GrandParent{
    String color ="Black";//1
    void printInfo(){
        System.out.println("I am a Parent");
    }
}
class Child extends Parent{
    String color="Red";//2
    void printInfo(){
        System.out.println("I am a child");
    }
    void print(){
        printInfo();
        super.printInfo();
}
void printColor(){
    String color ="Green";//3
    //refer to local variable
    System.out.println(color);//ans=3
    //refer to instance variable
    System.out.println(this.color);//ans=2
    //refer to parent variable
    System.out.println(super.color);//ans=1
}

}

