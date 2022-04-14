package com.syntax.class24;

public abstract class Phone {

    void makePhoneCall(){
        System.out.println("Making a phone call");
    }
    void sendText(){
        System.out.println("Sending a text");
    }
    abstract void displayPicture();// no need to create the body
}
// if parent have abstract child must have too ใส่ที่ชื่อคลาว หรือใส่ใน body

class Iphone extends Phone{
    //call same method from parent and assign value แต่ต้องทำตามข้อกำหนดของ abstract ในคลาสแม่
    @Override
    void displayPicture(){
        System.out.println("Use photo app to display the pics");
    }
}

class Samsung extends Phone{
    @Override
    void displayPicture(){
        System.out.println("Use gallery to display the pics");
    }
}
