package com.syntax.class26;

public class ShoppingTester {
    public static void main(String[] args) {

        Shopping shopper = new Shopping();
       // shopper.originalPrice=100; หลังจาก set variable เป็น ไพรเวท จะไม่สามารถแก้ไข ค่าตั้งต้ได้
        //shopper.discount=.20;
        // shopper.setDiscount(.20);
        shopper.setDiscount((0.2));
        shopper.calculatePrice();

        // how to access the original value
        System.out.println(shopper.getDiscount()); // ใช้เรียก ค่า ตั้งต้นของ variable มาดู แต่ต้องไป set method ก่อน

        //WebDriver webDriver=new ChromeDriver();
       //webDriver.get("www.google.com");

    }
}