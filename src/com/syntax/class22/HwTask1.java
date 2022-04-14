package com.syntax.class22;
/*Create a class named 'Programming'. While creating an object of the class,
     if nothing is passed to it, then the message "I love programming languages" should be printed.
     If some String is passed to it, then in place of "programming languages" the value variable
     should be printed. Example, if we pass "Java", then "I love Java" should be printed./*
     */
class Programming{
    Programming(){
        System.out.println("I love programming languages");
    }
    Programming(String str){
        System.out.println("I love " + str);
    }
}
public class HwTask1 {
    public static void main(String[] args) {
        new Programming();//"I love programming languages"
        new Programming("Java");// I love Java
        main("Gigi"); // เรียกจาก บรรทัดที่ 22
    }

    public static void main(String Ali) { // ลบ [] ออกได้ไม่มีผลอะไน มันคือการ overload main method
        Programming programming=new Programming();
        new Programming("Java");
    }
}


