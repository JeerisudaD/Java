package com.syntax.class20;
public class InClassTask3 {
    public static void main(String[] args) {
        MatchTeacher matchTeacher=new MatchTeacher();
        matchTeacher.teachMatch();
    }

}
class Teacher {
    String name;
    int age;
    double weight;
    void printName(){
        System.out.println(name);
    }
    void teaching(){
        System.out.println(name+" is teaching");
    }
    }
class MatchTeacher extends Teacher{
    void teachMatch(){
        System.out.println(name+" is teaching Match");
    }
}
class ChemTeacher extends Teacher{

    void lab(){
        System.out.println(name+" is preparing lab experiment");
    }
}

//class PianoTeacher extends Teacher {
   //void sing() {
       // System.out.println(name + " can sing");
  //  }
//}


