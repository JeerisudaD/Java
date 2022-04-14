package com.syntaxreview.reviewclass12;

public class Facebook {
    private String name;
    private int age;
    private String password;
    private String gender;
    private String phoneNumber;
    void setName(String name){
        if(name.length()<20 && name.contains("[0-9]")){

        }
    }

    public void createAccount(String name, int age, String password, String gender, String phoneNumber) {
        if (name.length() <= 20) {
            this.name = name;
            this.age = age;
            this.password = password;
            this.gender = gender;
            this.phoneNumber = phoneNumber;
        }
    }
    public void browseFacebook() {
        System.out.println(name + " is scrolling facebook");
    }
    public static void main(String[] args) {
        Facebook facebook=new Facebook();
        facebook.browseFacebook();
    }
}
