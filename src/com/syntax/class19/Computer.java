package com.syntax.class19;

public class Computer {
    // Write a java class that will have a constructor: one with parameters and second without any parameters.
    // Create a separate Test class where you will execute both of the constructors 1 by 1.
    String brand;
    String color;
    String type;
    int wide;
    int ram;

    Computer(String brand, String color, String type, int wide, int ram) {
        this.brand = brand;
        this.color = color;
        this.type = type;
        this.wide = wide;
        this.ram = ram;
    }
void printInfo(){
    System.out.println(brand+""+color+""+type+""+wide+""+ram);
}
    }



