package com.syntax.class25;

interface  HealthAble{
    void healthy();
}
   interface Walk extends HealthAble {
    void burnCalories();
}

interface Banana extends HealthAble{
        void giveEnergy();
    }

class Demo implements Banana {
    @Override
    public void healthy() {
        System.out.println("Bana");
    }
    ;

    @Override
    public void giveEnergy() {
        System.out.println("energy");
    }
}
