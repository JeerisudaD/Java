package com.syntax.class25;
public interface Human {
    //public static final redundant because by default all the variables are
    //public static final
    //public static final int legs=2;
    int legs=2; // ระบบ ขึ้นให้อยู่แล้วว่าเป็น public instance ดังนั้นเลยใส่แค่ variable
    //public abstract void walk();
     void walk() ;// ระบบใส่ public absrtact ให้แล้ว

    static void printLegs(){ // ระบใส่ public ให้แล้ว
        System.out.println(legs);
    }
    public default void noNeedToWorry(){// for java 8 ไม่ต้องสนใจ
        System.out.println("are there to functional programming");
    }
}
interface LivingBeing {
    static void printLegs() {
        System.out.println("not sure");
    }
}
class Maha implements Human,LivingBeing{
    @Override
    public void walk(){
        System.out.println("I can walk");
    }
    public static void main(String[] args) {
        Maha maha = new Maha();
        maha.walk();
        //Maha.printLegs(); cannot call static void by use class name be too many interface
        //so have to use interface name to call it
        Human.printLegs();
        LivingBeing.printLegs();
    }
}
