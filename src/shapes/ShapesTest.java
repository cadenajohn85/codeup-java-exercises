package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable myShape;

        myShape = new Square(5);
        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        
        myShape = new Rectangle(4, 6);
        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());

        // Question 9: Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?

            // It implements Measurable, which requires a mandatory method called getPerimeter.

        // Question 10: What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?

            // You cannot see them on myShape, because...
                // ... both Square and Rectangle are lacking getLength methods.
                // It exists on Quadrilateral, but nothing is ever done with it.
                // (How does that affect the answer?)

        // Inheritance and Polymorphism Exercise

//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
//        System.out.println("box1.getArea() = " + box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println("box2.getPerimeter() = " + box2.getPerimeter());
//        System.out.println("box2.getArea() = " + box2.getArea());

    }

}
