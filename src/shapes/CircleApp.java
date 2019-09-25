package shapes;

import util.Input;

public class CircleApp {

    private static int circleCount = 0;

    public static void main(String[] args) {
        Input input = new Input();
        makeCircle(input);
    }

    public static void makeCircle(Input input) {
//        double userRadius = input.getDouble();
//        Circle userCircle = new Circle(userRadius); // Not needed because Circle already has a radius property
        Circle userCircle = new Circle(input.getDouble("Please input the radius of the circle:"));
        circleCount++;
        System.out.format("The circumference is: %f units.%n", userCircle.getCircumference());
        System.out.format("The area is: %f units.%n", userCircle.getArea());
        if (input.yesNo("Would you like to create another circle?")) {
            makeCircle(input);
        } else {
            displayCircleCount();
            System.out.println("Thank you! Have a nice day.");
        }
    }

    public static void displayCircleCount() {
        if (circleCount == 1) {
            System.out.println("You created 1 circle with CircleApp today.");
        } else {
            System.out.format("You created %d circles with CircleApp today.%n", circleCount);
        }
    }

}
