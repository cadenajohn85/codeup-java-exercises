package shapes;

import util.Input;

public class CircleApp {

    private static int circleCount = 0;

    public static void main(String[] args) {
        Input input = new Input();
        makeCircle(input);
    }

    public static void makeCircle(Input input) {
        System.out.println("Please input the radius of the circle:");
        double userRadius = input.getDouble();
        Circle userCircle = new Circle(userRadius);
        circleCount++;
        System.out.format("The circumference is: %f units.%n", userCircle.getCircumference());
        System.out.format("The area is: %f units.%n", userCircle.getArea());
        System.out.println("Would you like to create another circle?");
        if (input.yesNo()) {
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
