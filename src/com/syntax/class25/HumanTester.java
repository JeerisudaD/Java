package com.syntax.class25;

public class HumanTester {
    public static void main(String[] args) {
        Maha maha = new Maha();
        maha.walk();
        //Maha.printLegs(); cannot call static void by use class name be too many interface
        //so have to use interface name to call it
        Human.printLegs();
        LivingBeing.printLegs();

    }
}
