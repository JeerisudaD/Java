package com.syntax.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class task1Tester {
    public static void main(String[] args) {
        ArrayList<Insurance> insurances = new ArrayList<>();
        insurances.add(new Car("Progressive","Tesla"));
        insurances.add(new Pet("AniInsurance","Dog"));
        insurances.add(new Health("Oscar"));

       for(Insurance ii:insurances){
           ii.getQuote();
           ii.cancelInsurance();
            //System.out.println(ii);
        }

        System.out.println();
        System.out.println("------------");
        Iterator<Insurance> iterator =insurances.iterator();
        while (iterator.hasNext()){
            Insurance i = iterator.next();
            i.getQuote();
            i.cancelInsurance();

        }

        }
    }
