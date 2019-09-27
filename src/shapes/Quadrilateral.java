package shapes;

abstract class Quadrilateral extends Shape implements Measurable {

    protected double length;
    protected double width;

    public Quadrilateral(double someLength, double someWidth) {
        this.length = someLength;
        this.width = someWidth;
    }

    public double getLength() {
        return this.length;
    }

    abstract void setLength();

    public double getWidth() {
        return this.length;
    }

    abstract void setWidth();

}
