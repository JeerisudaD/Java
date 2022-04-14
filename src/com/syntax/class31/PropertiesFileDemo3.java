package com.syntax.class31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo3 {
    public static void main(String[] args) throws IOException {
        //ต้องการเขียนไฟล์ที่อยุ่ข้างนอก
        String path ="C:\\Users\\jeeri\\OneDrive\\Desktop\\Sdet\\trump.properties";
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        Properties properties = new Properties();
        properties.put("IsCrazy","false");
        properties.put("IsRich","true");
        properties.store(fileOutputStream,"added some new fields");

    }

}
