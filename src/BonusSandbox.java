// This is a place to try out code.

import java.util.Scanner;

public class BonusSandbox {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10");
        int userNum = getInt(1, 10);
        System.out.println("Will we ever get to this text?");
        System.out.println("how about this text?");
        String secondUser = sc.nextLine();
        System.out.println(secondUser);

    }

    // with recursion

    public static int getInt(int min, int max) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int userNum = sc.nextInt();
            if (userNum >= min && userNum <= max) {
                return userNum;
            } else {
                System.out.println("Invalid range");
                return getInt(min, max);
            }
        } else {
            System.out.println("Invalid Input!");
            return getInt(min, max);
        }

    }

}
