package com.syntax.class16;

public class Task5{

    // How would you check if String is palindrome or not?
    //Example1: aba ---> true aba
    // Example2: Abbc --> false cbbA

    //  step1 create Method ใข้เป็น boolean โดยดึง method จากบีีทัดที่ 15 มาใช้
    boolean isPalindrome(String inputStr){
        String reversedStr=reverseString(inputStr);// reversing a word
        return reversedStr.equals(inputStr); // checking if words are same
    }
    // step 2 create method for reverse (เคสนี้ copy from task 4)
    String reverseString(String inputString){
        //converting S string to StringBuilder so that we can use the reverse method
        StringBuilder stringBuilder=new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
    //step 3 call the method
    public static void main(String[] args) {
        Task5 task=new Task5();
        System.out.println(task.isPalindrome("aba"));
        System.out.println(task.isPalindrome("Abbc"));

    }
}
