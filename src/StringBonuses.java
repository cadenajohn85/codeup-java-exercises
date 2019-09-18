import java.util.Scanner;

public class StringBonuses {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//                ----BONUS 1
//
//        Create date format converter application.
//                Take in the following format:
//
//        MM/DD/YYYY
//
//        Output the following:
//
//        MonthName DD, YYYY
//
//        Example:
//
//        input - 12/01/1999
//        output - December 1, 1999

//        System.out.println("Date Converter - Please enter a date in MM/DD/YYYY format:");
//        String userDate = input.nextLine();
//
//        int userMonth = Integer.parseInt(userDate.substring(0, userDate.indexOf("/")));
//        int userDayOfMonth = Integer.parseInt(userDate.substring(userDate.indexOf("/") + 1, userDate.lastIndexOf("/")));
//        int userYear = Integer.parseInt(userDate.substring(userDate.lastIndexOf("/") + 1));
//
//        String formattedMonth;
//
//        switch (userMonth) {
//            case 1:
//                formattedMonth = "January";
//                break;
//            case 2:
//                formattedMonth = "February";
//                break;
//            case 3:
//                formattedMonth = "March";
//                break;
//            case 4:
//                formattedMonth = "April";
//                break;
//            case 5:
//                formattedMonth = "May";
//                break;
//            case 6:
//                formattedMonth = "June";
//                break;
//            case 7:
//                formattedMonth = "July";
//                break;
//            case 8:
//                formattedMonth = "August";
//                break;
//            case 9:
//                formattedMonth = "September";
//                break;
//            case 10:
//                formattedMonth = "October";
//                break;
//            case 11:
//                formattedMonth = "November";
//                break;
//            case 12:
//                formattedMonth = "December";
//                break;
//            default:
//                formattedMonth = "(Invalid month entry)";
//        }
//
//        System.out.format("%s %d, %d", formattedMonth, userDayOfMonth, userYear);

//
//
//                ----BONUS 2
//
//        Create an application that allows the user to enter a sentence
//        and tells them how many vowels and consonants were used.
//
//        Example:
//
//        input - "The hill are alive."
//        output - 5 vowels and 10 consonants

        System.out.println("Please enter a sentence:");
        String userSentence = input.nextLine();

        int vowelCounter = 0;
        int consonantCounter = 0;

        for (int i = 0; i < userSentence.length(); ++i) {
            if (userSentence.toLowerCase().charAt(i) == 'a' ||
                    userSentence.toLowerCase().charAt(i) == 'e' ||
                    userSentence.toLowerCase().charAt(i) == 'i' ||
                    userSentence.toLowerCase().charAt(i) == 'o' ||
                    userSentence.toLowerCase().charAt(i) == 'u') {
                vowelCounter++;
            } else if (userSentence.toLowerCase().charAt(i) == 'b' ||
                    userSentence.toLowerCase().charAt(i) == 'c' ||
                    userSentence.toLowerCase().charAt(i) == 'd' ||
                    userSentence.toLowerCase().charAt(i) == 'f' ||
                    userSentence.toLowerCase().charAt(i) == 'g' ||
                    userSentence.toLowerCase().charAt(i) == 'h' ||
                    userSentence.toLowerCase().charAt(i) == 'j' ||
                    userSentence.toLowerCase().charAt(i) == 'k' ||
                    userSentence.toLowerCase().charAt(i) == 'l' ||
                    userSentence.toLowerCase().charAt(i) == 'm' ||
                    userSentence.toLowerCase().charAt(i) == 'n' ||
                    userSentence.toLowerCase().charAt(i) == 'p' ||
                    userSentence.toLowerCase().charAt(i) == 'q' ||
                    userSentence.toLowerCase().charAt(i) == 'r' ||
                    userSentence.toLowerCase().charAt(i) == 's' ||
                    userSentence.toLowerCase().charAt(i) == 't' ||
                    userSentence.toLowerCase().charAt(i) == 'v' ||
                    userSentence.toLowerCase().charAt(i) == 'w' ||
                    userSentence.toLowerCase().charAt(i) == 'x' ||
                    userSentence.toLowerCase().charAt(i) == 'y' ||
                    userSentence.toLowerCase().charAt(i) == 'z') {
                consonantCounter++;
            }
        }
        System.out.format("%d vowels and %d consonants", vowelCounter, consonantCounter);


//
//
//                ----BONUS 3
//
//        Create a command line calculator application.
//
//        The program should welcome the user, prompt them for a calculation,
//        and give the result. The user should be prompted after each result is
//        outputted if they want to enter another calculation. When they
//        say no, give them an exit message. Allow the user first to specify
//        how many operands they will enter. Do not worry about
//        input validation (assume user enters correct data type).
//
//        Example program:
//
//...
//
//        WELCOME TO THE CALCULATOR APP!!! (program output)
//
//        Do you wish to enter a new calculation? (program output)
//        yes (user inputs this)
//
//        How many operands will you calculate? (program output)
//        2 (user inputs this)
//
//        Please enter a calculation: (program output)
//        2 + 2 (user enters this or something like this)
//        The output of 2 + 2 is 4. (program outputs this)
//
//        Do you wish to enter a new calculation? (program outputs this)
//        no (user enters this)
//
//        GOODBYE!!!



    }
}
