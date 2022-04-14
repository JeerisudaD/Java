package com.syntax.class24;

public class Task1Tester {
    public static void main(String[] args) {
        SyntaxStudent syn = new SyntaxStudent();
        syn.study();
        // in java we can store the object of a child classes in a parent type variable
        //every class in java can be treated as data type

        Student synStudent = new SyntaxStudent();
        Student schoolStudent = new SchoolStudent();
        /* as we can store the object of a child class in a parent class
        we can also create on array of these students as show below

         */
        Student[] students = {new SyntaxStudent(), new SchoolStudent(), new CollegeStudent()};
        for (Student student : students) {
            //calling methods from all the children classes
            student.study();
            student.doHomeWork();
            student.practice();
        }
    }
}
