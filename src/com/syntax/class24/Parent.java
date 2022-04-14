package com.syntax.class24;
//final keyword คือไม่ต้องการให้ใคร extents คลาสของตัวเอง
// final สามารถใส่ใน method ได้ด้วย เพื่อไม่ต้องการให้้ลูกๆ override specific method

public class Parent {
    final void method() {
        System.out.println("I am parent");
    }
}
class Child extends Parent{
    //void method(){
        //can't override method
    }
