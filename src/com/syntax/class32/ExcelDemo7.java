package com.syntax.class32;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDemo7 {
    public static void main(String[] args) throws IOException {
            String path = "C:\\Users\\jeeri\\Documents\\Tester.xlsx";
            FileInputStream fileInputStream = new FileInputStream(path);
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = xssfWorkbook.getSheetAt(0);//sheet 1
            Row row = sheet.createRow(6);
            row.createCell(0).setCellValue("christ");
            row.createCell(1).setCellValue("gaga");
            row.createCell(2).setCellValue("25");
            row.createCell(3).setCellValue("NY");
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            xssfWorkbook.write(fileOutputStream);


        }
    }