package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double someLength, double someWidth) {
        super(someLength, someWidth);
    }

    public void setLength(double someLength) {
//        this.length = someLength; // Works but less clear
        super.length = someLength;
    }

    public void setWidth(double someWidth) {
//        this.width = someWidth;
        super.width = someWidth;
    }

    public double getPerimeter() {
//        return (this.length * 2) + (this.width *2);
        return (super.length * 2) + (super.width *2);
    }

    public double getArea() {
//        return (this.length * this.width);
        return (super.length * 2) + (super.width *2);
    }

    // Inheritance and Polymorphism Exercise

//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea() {
//        return this.length * this.width;
//    }
//
//    public double getPerimeter() {
//        return 2 * this.length + 2 * this.width;
//    }


}
