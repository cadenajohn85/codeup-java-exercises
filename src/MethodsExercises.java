import java.util.Scanner;

public class MethodsExercises {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static double divideDoubles(double num1, double num2) {
        return num1 / num2;
    }

    public static int divideInts(int num1, int num2) {
        if (num2 == 0) {
            // Can't return an error message;
            return 55555;
        } else {
            return num1 / num2;
        }
    }

    public static int modulo(int num1, int num2) {
        return num1 % num2;
    }

    public static int bonusMult(int num1, int num2) {
        int total = 0;
        for (int i = 0; i < java.lang.Math.abs(num1); i++) {
            total += num2;
        }
        if (num1 != java.lang.Math.abs(num1)) {
            total = 0 - total;
        }
        return total;
    }

    public static int recursiveMult(int num1, int num2) {
        // If both numbers are negative, turn them positive
        if (Integer.signum(num1) == -1 && Integer.signum(num2) == -1) {
            num1 = java.lang.Math.abs(num1);
            num2 = java.lang.Math.abs(num2);
        }
        // If number2 is negative, avoid stack overflow by swapping values of num1 and num2
        if (Integer.signum(num2) == -1) {
            int placeholder = num1;
            num1 = num2;
            num2 = placeholder;
        }
        // Normal recursive conditions
        if (num2 == 0) {
            return 0;
        }
        return num1 + recursiveMult(num1, num2 - 1);
    }

    // Problem 2
//        Create a method that validates that user input is in a certain range
//        The method signature should look like this:
//
//        public static int getInteger(int min, int max);
//        and is used like this:
//
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//        If the input is invalid, prompt the user again.
//                Hint: recursion might be helpful here!

//    public static int getInteger(int min, int max) {
//
//    }

    //Problem 3

//    Calculate the factorial of a number.
//
//    Prompt the user to enter an integer from 1 to 10.
//    Display the factorial of the number entered by the user.
//    Ask if the user wants to continue.
//    Use a for loop to calculate the factorial.
//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Use the long type to store the factorial.
//    Continue only if the user agrees to.
//    A factorial is a number multiplied by each of the numbers before it.
//    Factorials are denoted by the exclamation point (n!). Ex:
//
//
//            1! = 1               = 1
//            2! = 1 x 2           = 2
//            3! = 1 x 2 x 3       = 6
//            4! = 1 x 2 x 3 x 4   = 24

    // Problem 4

//    Create an application that simulates dice rolling.
//
//    Ask the user to enter the number of sides for a pair of dice.
//    Prompt the user to roll the dice.
//"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//            Use static methods to implement the method(s) that generate the random numbers.
//    Use the .random method of the java.lang.Math class to generate random numbers.

    public static void rollDice(int diceSize) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hit <Enter> to roll the dice!");
        input.nextLine();
        int dieResult1 = (int) (Math.random() * diceSize) + 1;
        int dieResult2 = (int) (Math.random() * diceSize) + 1;
        System.out.format("You rolled: %d %d%n", dieResult1, dieResult2);
        System.out.println("Would you like to roll the dice again? [ y | n ]");
        if (input.nextLine().toLowerCase().equals("y")) {
            rollDice(diceSize);
        } else {
            System.out.println("Thank you!");
        }
    }

    public static void main(String[] Args) {
//        System.out.println(add(3, 7));
//        System.out.println(subtract(3, 7));
//        System.out.println(multiply(3, 7));
    // Divide only returns the quotient if the parameters are defined as int, even if the method returns a double.
//        System.out.println(divideDoubles(3, 7));
//        System.out.println(divideInts(3, 7));
//        System.out.println(modulo(8, 3));

        System.out.println(divideDoubles(8, 0));
        System.out.println(divideInts(8, 0));

//        System.out.println(bonusMult(4, 7));
//        System.out.println(recursiveMult(9, -5));

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of sides for the dice:");
        int diceSize = Integer.parseInt(input.nextLine());
        rollDice(diceSize);




    }

}
