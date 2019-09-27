package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    public double getPerimeter() {
        return (4 * this.length);
    }

    public double getArea() {
        return Math.pow(this.length, 2);
    }

    // Inheritance and Polymorphism Exercise

//    protected double side;
//
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    public double getArea() {
//        return Math.pow(this.side, 2);
//    }
//
//    public double getPerimeter() {
//        return 4 * this.side;
//    }

}
