package com.syntax.class29;

import java.util.HashSet;
import java.util.Set;

public class Task4 {
    /* /*
        Create a Set collection that will hold Objects of Student Type.
         In this set we do not care about the insertion order. Each student object should
        have name and studentID. Display name of each student
         */
    // check console ลำดับการปริ้ินออกอีกที
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("DD","123"));
        students.add(new Student("BB","456"));
        students.add(new Student("CC","789"));
        for(Student s:students){
            s.printName();
        }
    }
}
class Student {
    String name;
    String studentId;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    void printName() {
        System.out.println(name);
    }
}
