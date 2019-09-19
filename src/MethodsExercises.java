import java.util.Scanner;

public class MethodsExercises {

    // Problem 1: Basic Math Methods

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divideDoubles(double num1, double num2) {
        return num1 / num2;
    }

//    public static int divideInts(int num1, int num2) {
//        if (num2 == 0) {
//            // Can't return an error message;
//            return 55555;
////            System.out.println("You entered 0 for the second operand -- division by zero is not possible.");
////            break;
//        } else {
//            return num1 / num2;
//        }
//    }

    public static double modulo(double num1, double num2) {
        return num1 % num2;
    }

    public static double bonusMult(double num1, double num2) {
        double total = 0;
        for (double i = 0; i < java.lang.Math.abs(num1); i++) {
            total += num2;
        }
        if (num1 != java.lang.Math.abs(num1)) {
            total = 0 - total;
        }
        return total;
    }

    public static double recursiveMult(double num1, double num2) {
        // If both numbers are negative, turn them positive
        if (Integer.signum((int) num1) == -1 && Integer.signum((int) num2) == -1) {
            num1 = java.lang.Math.abs(num1);
            num2 = java.lang.Math.abs(num2);
        }
        // If number2 is negative, avoid stack overflow by swapping values of num1 and num2
        if (Integer.signum((int) num2) == -1) {
            double placeholder = num1;
            num1 = num2;
            num2 = placeholder;
        }
        // Normal recursive conditions
        if (num2 == 0) {
            return 0;
        }
        return num1 + recursiveMult(num1, num2 - 1);
    }

    // Problem #2: Validate User Input

    public static int getInteger(int min, int max) {
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            int userInput = Integer.parseInt(input.nextLine());
            if (userInput < min || userInput > max) {
                System.out.println("Invalid input: You must input an integer between 1 and 10.");
                return getInteger(1, 10);
            } else {
                return userInput;
            }
        } else {
            System.out.println("Invalid input: You must input an integer.");
            return getInteger(1, 10);
        }
    }

    //Problem 3: Calculate Factorials

    public static void calculateFactorial(Scanner input) {
        System.out.println("Please enter an integer from 1 to 10.");
        int userInteger = getInteger(1, 10);
        long factorialSum = 1;
        for (int i = 1; i <= userInteger; i++) {
            factorialSum *= i;
        }
        System.out.format("%d! = %d%n", userInteger, factorialSum);
        System.out.println("Would you like to calculate another factorial? [ y | n ]");
        if (input.nextLine().toLowerCase().equals("y")) {
            calculateFactorial(input);
        } else {
            System.out.println("Thank you! Have a nice day.");
        }
    }

    // Problem 4: Roll the Dice

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
        Scanner input = new Scanner(System.in);

        // Problem #1 Method Calls
//        System.out.println(add(3, 7));
//        System.out.println(subtract(3, 7));
//        System.out.println(multiply(3, 7));
//        System.out.println(divideDoubles(3, 7));
//        System.out.println(divideDoubles(8, 0));
//        System.out.println(modulo(8, 3));
//        System.out.println(bonusMult(4, 7));
//        System.out.println(recursiveMult(9, -5));

        // Problem #2 Method Calls
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);

        // Problem #3 Method Calls
        calculateFactorial(input);

        // Problem #4 Method Calls
//        System.out.println("Please enter the number of sides for the dice:");
//        int diceSize = Integer.parseInt(input.nextLine());
//        rollDice(diceSize);



    }

}
