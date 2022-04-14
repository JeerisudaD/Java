package com.syntax.class17;

public class HealthyDog {
    // when the information is expected to be different from object to object
    //we store that information in an instance variable = หมา แต่ละตัวมีชื่อ แต่มีชื่อไม่เหมือนกัน

    String name; //instance
    String color; //instance

    //if we know that a value will stay same for all the objects of a class
    // we create a static variable for that why because
    //= หมาทุกตัวเห่าได้เหมือนกันหมด เพระางั้นใช้ static เพื่อช่วยประหยัด memory

    static int numberOfLegs=4; //static

    void eat(){
        int noOfTimes=3; //local
        System.out.println(name+ " eats "+noOfTimes);
    }

    void sleep(){
      //System.out.println(name+" sleeping"+noOfTimes); // can access local variables in other methods
        // +noOfTimes ทำให้เกิด error เพราะว่าไม่สามารถดึง local var จาก method อื่นมาใช้งานได้ ในอีกหนึ่ง method
        // หากต้องกาารใช้ค่าเดียวกันได้ในหลายๆ method จะต้องเลือกสร้างแบบ instance var
    }
    void test(){
        System.out.println("test"+name+numberOfLegs);
    }
    public static void main(String[] args) {
        HealthyDog dog=new HealthyDog(); //local

        dog.name="scooby";
        dog.color="Pink";
        HealthyDog.numberOfLegs=6; // ใช้ class name เพระารูเ้อยู่แล้วว่า ทุก object มี method เดียวกันประหยัด
        dog.eat();
        dog.test();

        HealthyDog dog2=new HealthyDog();
        dog2.name="tomy";
        dog2.color="Navi blue";
        System.out.println(HealthyDog.numberOfLegs);
        dog2.eat();

    }
}
