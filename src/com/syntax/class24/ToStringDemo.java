package com.syntax.class24;

public class ToStringDemo {
    String name;
    int age;

    ToStringDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Mr. A please show your face";
    }

    //Override
   // public String toString() {
       // return name + "" + age;


        public static void main (String[]args){
            ToStringDemo toStringDemo = new ToStringDemo("Mr.A", 10);
            System.out.println(toStringDemo);// nonsense --> com.syntax.classs24.ToStringDemo@1b6d3586
            // ปริ้นออกมาเป็ฯ nonsense เพราะระบบจะไปเรียก to string method ซึ่งจะ return สิ่งท่ระบบมีอยู่แล้ว ใน parent obj class
            // ดังนั้นเลยทำการ override
            System.out.println(toStringDemo.toString());
        }


    }


