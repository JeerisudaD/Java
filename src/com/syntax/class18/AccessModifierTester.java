package com.syntax.class18;

public class AccessModifierTester {
    public static void main(String[] args) {

        /*
        Can't access as name has private access
         */
        AccessModifiers am=new AccessModifiers();
       // System.out.println(am.name);
        System.out.println(am.age); // default same package ok , different package will get error
        System.out.println(am.weight); //protected same package ok different package only curtain condition
        System.out.println(am.color);  // can access anywhere
    }
}
