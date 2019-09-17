import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        input.useDelimiter("\n");

        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);

        System.out.println("Please enter an integer:");
        int userInt = input.nextInt();
        System.out.format("Your integer is: %s%n", userInt);

        System.out.println("Please enter three different words.");
        String userWord1 = input.nextLine();
        String userWord2 = input.nextLine();
        String userWord3 = input.nextLine();
        System.out.println(userWord1);
        System.out.println(userWord2);
        System.out.println(userWord3);

        // System.out.format("s1: %s%ns2: %s%ns3: %s%n", userWord1, userWord2, userWord3);

        System.out.println("Please enter a sentence.");
        String userSentence = input.nextLine();
        System.out.println(userSentence);

//        System.out.println("Please enter the length and width of your classroom:");
//        String length = input.next();
//        String width = input.next();
//        int numLength = Integer.parseInt(length);
//        int numWidth = Integer.parseInt(width);
//        int perimeter = 2 * numLength + 2 * numWidth;
//        int area = numLength * numWidth;
//        System.out.format("The perimeter of the room is %s units, and the area of the room is %s units.%n", perimeter, area);

//        System.out.println("Please enter the length, width, and height of your classroom:");
//        String length = input.next();
//        String width = input.next();
//        String height = input.next();
//        double numLength = Double.parseDouble(length);
//        double numWidth = Double.parseDouble(width);
//        double numHeight = Double.parseDouble((height));
//        double perimeter = 2 * numLength + 2 * numWidth;
//        double area = numLength * numWidth;
//        double volume = numLength * numWidth * numHeight;
//        System.out.format("The perimeter of the room is %.2f units.%n" +
//                "The area of the room is %.2f units.%n" +
//                "The volume of the room is %.2f units.%n", perimeter, area, volume);

        System.out.println("Please enter the length, width, and height of your classroom:");
        int length = input.nextInt();
        // int length = Integer.parseInt(input.nextLine());


        int width = input.nextInt();
        int height = input.nextInt();
        int perimeter = 2 * length + 2 * width;
        int area = length * width;
        int volume = length * width * height;
        System.out.format("The perimeter of the room is %s units.%n" +
                "The area of the room is %s units.%n" +
                "The volume of the room is %s units.%n", perimeter, area, volume);



    }
}
