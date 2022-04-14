package com.syntax.class28;

import java.util.LinkedList;

public class ListDemo4 {
    public static void main(String[] args) {
        Student gigi = new Student("Gigi",15,"reading");
        Student jay = new Student("Jay",16,"skiing");
        Student bow = new Student("Bow",17,"bowling");

        LinkedList<Student> studentLinkedList=new LinkedList<>();
        studentLinkedList.add(gigi);
        studentLinkedList.add(jay);
        studentLinkedList.add(bow);
        System.out.println(studentLinkedList);

    }
}
class Student{
    String name;
    int age;
    String hobbies;


    public Student(String name, int age, String hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies='" + hobbies + '\'' +
                '}';
    }
}
