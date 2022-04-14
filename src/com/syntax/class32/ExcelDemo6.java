package com.syntax.class32;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelDemo6 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\jeeri\\Documents\\Tester.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");

        List<Map<String,String>> excelData = new ArrayList<>();
        // store header row inside variable
        Row headerRow =sheet.getRow(0);
        //loops start from 1 bc we don't need to store the header row from step before
        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            //get each row in any iteration
            Row row = sheet.getRow(i);
            //create map to store the data
            LinkedHashMap<String ,String> linkedHashMap=new LinkedHashMap();
            //store data each cell
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                //get key which is from header row                //get value which is from each cell
                linkedHashMap.put(headerRow.getCell(j).toString(),row.getCell(j).toString());
            }
           excelData.add(linkedHashMap);
        }
        System.out.println(excelData);
    }
}
