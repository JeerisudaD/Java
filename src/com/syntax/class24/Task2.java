package com.syntax.class24;
public class Task2 {
    public static void main(String[] args) {
        //if a method is not present inside the parent class we can't call that method using poly
    }
    /*Create a class File that will have the following behaviors: open, edit, close.
    Edit and close are implemented method while open is an abstract.
    Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation
    of open behaviour: Example: to open .java file we need notepad++ or sublime text,
    to open
    */
}
abstract class File {
    abstract void openFile();

    void editFile(){
        System.out.println("edit");
    }
    void closeFile(){
        System.out.println("close");
    }
}
class JavaFile extends File{
    @Override
    void openFile(){
        System.out.println("Use intelliji to open java file");
    }
}
class WordFile extends File{
    @Override
    void openFile(){
        System.out.println("Use Microsoft word to open file");
    }
}

class PdfFile extends File{
    @Override
    void openFile(){
        System.out.println("Use Adobe to open file");
    }
}