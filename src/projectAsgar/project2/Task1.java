package projectAsgar.project2;

interface Shape1{
    void calculateArea(double input);
    void calculatePerimeter(double input);
}
class Circle implements Shape1 {

    @Override
    public void calculateArea(double input) {
        double area=Math.PI*Math.pow(input,2);
        System.out.println(area);
    }
    @Override
    public void calculatePerimeter(double input) {
        System.out.println(2*Math.PI*input);
    }
}

class Square implements Shape1 {

    void test(){

    }
    @Override
    public void calculateArea(double input) {
        double area=input*input;
        System.out.println(area);
    }
    @Override
    public void calculatePerimeter(double input) {
        double perimeter=4*input;
        System.out.println(perimeter);
    }
}

public class Task1 {
    /*
    Create an Interface 'Shape' with undefined methods as calculateArea and
    calculatePerimiter. Create 2 classes Circle & Square that implements functionality
    defined in the Shape Interface. Test your code.
     */
    public static void main(String[] args) {
        Shape1 shape = new Square();
        shape.calculatePerimeter(10);
        shape.calculateArea(5);
        // ((Square)shape).test();

    }
}