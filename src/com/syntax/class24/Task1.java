package com.syntax.class24;

public class Task1 {
    /*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
     */
}
class Student{
    void study(){
        System.out.println("Student must study to pass");
    }
    void doHomeWork(){
        System.out.println("Student must do hw ");
    }
    void practice(){
        System.out.println("Student must to practice");
    }
}

class SyntaxStudent extends Student{
    void study(){
        System.out.println("Syntax students must study 25 hours a week");
    }
    void doHomeWork(){
        System.out.println("Student must solve Replit");
    }
    @Override
    void practice(){
        System.out.println("Syntax must do their own research");
    }
}

class CollegeStudent extends Student {
    @Override
    void doHomeWork() {
        System.out.println("College students can skip some of the homeworks");
    }
}

class SchoolStudent extends Student{

        }
