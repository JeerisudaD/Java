package com.syntax.class33;

public class DoSomething {
    void doSomeThing(int a,int b){
        Calculator calculator= new Calculator();
        calculator.DoTheMath(a,b);
    }

    public static void main(String[] args) {
        DoSomething doSomething=new DoSomething();
        doSomething.doSomeThing(10,0);
    }

}
