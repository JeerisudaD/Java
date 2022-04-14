package com.syntaxreview.reviewclass10;

public class GrandParent {
    String name;

    GrandParent(String name) {
        // System.out.println("Grand Parent");
        this.name = name;
    }
    void printName() {
        System.out.println(name);
    }
}

    class Parent extends GrandParent {

        Parent(String name) {
            super(name);
            printName();
            // System.out.println("Parent");
        }

    }

    class Child extends Parent {
        Child(String name) {
            super(name);
            // System.out.println("Child");
        }
    }

    class Tester {
        public static void main(String[] args) {
            Child child = new Child("Edward");
            child.printName();
        }
    }
