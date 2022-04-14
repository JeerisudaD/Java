package com.syntax.class24;

public class FinalDemo {
    final String name;// ถ้าเรายังไม่รู้ ว่าจะใส่ค่าของ final variable ว่าเป็นค่าอะไร สามารถใช้ constructor ช่วยเซ็ต
    // แต่ถ้ามีการ assign ไปแล้ว จะไม่สามารถแก้ไขได้อีก

    FinalDemo(String  name){

        this.name=name; // possible to assign the value using constructor
    }
}
