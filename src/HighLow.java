import java.util.Scanner;

public class HighLow {

    // Problem 5: Game Development 101

//    Welcome to the world of game development!
//    You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//    The specs for the game are:
//
//    Game picks a random number between 1 and 100.
//    Prompts user to guess the number.
//    All user inputs are validated.
//    If user's guess is less than the number, it outputs "HIGHER".
//    If user's guess is more than the number, it outputs "LOWER".
//    If a user guesses the number, the game should declare "GOOD GUESS!"
//    Hints
//
//    Use the random method of the java.lang.Math class to generate a random number.
//    Bonus
//
//    Keep track of how many guesses a user makes.
//    Set an upper limit on the number of guesses.

    public static void validateRangeOf(int userGuess) {
        if (userGuess < 1 || userGuess > 100) {
            Scanner input = new Scanner(System.in);
            System.out.println("That number is outside of the valid range. Guess a number between 1 and 100:");
            validateRangeOf(Integer.parseInt(input.nextLine()));
        }
    }

    public static void processUserGuess(Scanner input) {
        int userGuess = Integer.parseInt(input.nextLine());
        validateRangeOf(userGuess);
//        if (too high) {
//
//        } else if (too low) {
//
//        } else (win) {
//
//        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Welcome to HighLow! I'm thinking of a number between 1 and 100. Guess my number:");




    }

}
