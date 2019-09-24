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
        String userString = scanner.nextLine();
        return (userString.equalsIgnoreCase("yes") ||
                userString.equalsIgnoreCase("y"));
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public int getInt(int min, int max) {
        int userInt = Integer.parseInt(scanner.nextLine());
        if (userInt < min || userInt > max) {
            return getInt(min, max);
            } else {
                return userInt;
            }
        }

    public double getDouble() {
        return scanner.nextDouble();
    }

    public double getDouble(double min, double max) {
        double userDouble = Double.parseDouble(scanner.nextLine());
        if (userDouble < min || userDouble > max) {
            return getDouble(min, max);
        } else {
            return userDouble;
        }
    }





}
