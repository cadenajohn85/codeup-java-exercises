package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Type something:");
        return this.scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Type y/n:");
        String userString = scanner.nextLine();
        return (userString.equalsIgnoreCase("yes") ||
                userString.equalsIgnoreCase("y"));
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userString = scanner.nextLine();
        return (userString.equalsIgnoreCase("yes") ||
                userString.equalsIgnoreCase("y"));
    }

    public int getInt() {
        System.out.println("Type an integer:");
        try {
            return Integer.valueOf(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("That was not an integer.");
            return getInt();
        }
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        try {
            return Integer.valueOf(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("That was not an integer.");
            return getInt(prompt);
        }
    }

    public int getInt(int min, int max) {
        int userInt = getInt();
        if (userInt < min || userInt > max) {
            System.out.format("That number is out of range.  Please enter an integer between %d and %d.%n", min, max);
            return getInt(min, max);
        } else {
            return userInt;
        }
    }

    public int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        try {
            int userInt = Integer.valueOf(scanner.nextLine());
            if (userInt < min || userInt > max) {
                System.out.format("That number is out of range.  Please enter an integer between %d and %d.%n", min, max);
                return getInt(min, max);
            } else {
                return userInt;
            }
        } catch (NumberFormatException e) {
            System.out.println("That was not a valid integer.");
            return getInt(min, max, prompt);
        }
    }

    public double getDouble() {
        System.out.println("Type a decimal number:");
        try {
            return Double.valueOf(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("That was not a valid decimal number.");
            return getDouble();
        }
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        try {
            return Double.valueOf(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("That was not a valid decimal number.");
            return getDouble(prompt);
        }

    }

    public double getDouble(double min, double max) {
        double userDouble = getDouble();
        if (userDouble < min || userDouble > max) {
            System.out.format("That number is out of range.  Please enter a decimal number between %f and %f.%n", min, max);
            return getDouble(min, max);
        } else {
            return userDouble;
        }
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        try {
            double userDouble = Double.valueOf(scanner.nextLine());
            if (userDouble < min || userDouble > max) {
                System.out.format("That number is out of range.  Please enter a decimal number between %f and %f.%n", min, max);
                return getDouble(min, max);
            } else {
                return userDouble;
            }
        } catch (NumberFormatException e) {
            System.out.println("That was not a valid double.");
            return getDouble(min, max, prompt);
        }
    }

    public int getBinary() {
        System.out.println("Type a number in binary:");
        try {
            return Integer.valueOf(scanner.nextLine(), 2);
        } catch (NumberFormatException e) {
            System.out.println("That was not a valid number in binary.");
            return getBinary();
        }
    }

    public int getHex() {
        System.out.println("Type a number in hexadecimal:");
        try {
            return Integer.valueOf(scanner.nextLine(), 16);
        } catch (NumberFormatException e) {
            System.out.println("That was not a valid number in hexadecimal.");
            return getHex();
        }
    }

}
