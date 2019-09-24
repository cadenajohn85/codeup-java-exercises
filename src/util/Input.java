package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        return (scanner.nextLine().equalsIgnoreCase("yes") ||
                scanner.nextLine().equalsIgnoreCase("y"));
    }

    public int getInt() {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            return getInt();
        }
    }

    public int getInt(int min, int max) {
        if (scanner.hasNextInt() && scanner.nextInt() >= min && scanner.nextInt() <= max) {
            return scanner.nextInt();
        } else {
            return getInt(min, max);
        }
    }

    public double getDouble() {
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else {
            return getDouble();
        }
    }

    public double getDouble(double min, double max) {
        if (scanner.hasNextDouble() && scanner.nextDouble() >= min && scanner.nextDouble() <= max) {
            return scanner.nextDouble();
        } else {
            return getDouble(min, max);
        }
    }





}
