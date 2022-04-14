package com.syntax.class30;

import java.util.HashMap;

public class Task1 {
    /* Create a map of a building. Store floor number and it is associated company name.
    (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
     */
    public static void main(String[] args) {
        HashMap<Integer, String> building = new HashMap<>();
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(3,"TT&T");
        building.put(3,"Amazon");
        building.put(4,"Amazon");
        building.put(5,"Google");
        building.put(6,"Samsung");
        building.put(7,"Syntax");

        System.out.println("How may entries : "+building.size());
        System.out.println(building);
        //should use replace to update ถ้าเราใช้ put แล้วกดผิดมันจะไปเพิ่มในระบบ
        System.out.println("Update company on the 4th floor");
        //building.put(41,"Tesla");
        building.replace(4,"Tesla");// more secure
        building.replace(41,"Facebook");//ระบบจะไม่เจอ ก้อจะปลอดภัย

        System.out.println(building);
        System.out.println("Remove company on the 7th floor");
        building.remove(7);
        System.out.println(building);

    }
}
