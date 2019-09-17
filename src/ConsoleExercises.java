import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f%n", pi);

        Scanner input = new Scanner(System.in);

//        System.out.println("Please enter an integer:");
//        int userInt = input.nextInt();
//        System.out.format("Your integer is: %s", userInt);

//        System.out.println("Please enter three different words, each separated by a space:");
//        String userWord1 = input.next();
//        String userWord2 = input.next();
//        String userWord3 = input.next();
//        System.out.println(userWord1);
//        System.out.println(userWord2);
//        System.out.println(userWord3);

//        System.out.println("Please enter a sentence.");
//        String userSentence = input.nextLine();
//        System.out.println(userSentence);

        System.out.println("Please enter the length and width of your classroom:");
        String length = input.next();
        String width = input.next();
        int numLength = Integer.parseInt(length);
        int numWidth = Integer.parseInt(width);
        int perimeter = 2 * numLength + 2 * numWidth;
        int area = numLength * numWidth;
        System.out.format("The perimeter of the room is %s units, and the area of the room is %s units.%n", perimeter, area);



    }
}
