package com.syntax.class24;

public class Task2Tester {
    public static void main(String[] args) {
    File[] file= {new JavaFile(),new WordFile(),new PdfFile()};
    for (File files:file){
        files.openFile();
        files.editFile();
        files.closeFile();

        }
    }
}
