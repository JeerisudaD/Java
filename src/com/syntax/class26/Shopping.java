package com.syntax.class26;

public class Shopping {
    // make the field private เพื่อป้องกัน คนอื่นมาเปลี่ยนข้อมูลตั้งต้น
    private double originalPrice=100;
    private double discount =.15;

    void setDiscount(double discount){
        if(discount>0&&discount<=.15){
            this.discount=discount;
        }else {
            System.out.println("can't have that much discount");
        }
    }
    public double getDiscount (){
        return discount;
    }

    void calculatePrice(){
        double price = originalPrice-(originalPrice*discount);
        System.out.println(price);
    }
}
