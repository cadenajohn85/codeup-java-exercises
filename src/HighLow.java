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


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to HighLow! I'm thinking of a number between 1 and 100. Guess my number:");
        playGame(input);
    }

    public static void playGame(Scanner input) {
        int guessCounter = 0;
        int randomNumber = (int) (Math.random() * 100) + 1;
        validateUserGuess(randomNumber, input, guessCounter);
        System.out.println("Would you like to play again? [ y | n ]");
        if (input.nextLine().toLowerCase().equals("y")) {
            System.out.println("I'm thinking of a number between 1 and 100. Guess my number:");
            playGame(input);
        } else {
            System.out.println("Thanks for playing. Have a nice day!");
        }
    }

    public static void validateUserGuess(int randomNumber, Scanner input, int guessCounter) {
        // Bugs:
        // * Fix empty strings
        // * Fix extra whitespace
//        if (input.nextLine().isEmpty()) {
//            input.nextLine(); // This clear the scanner of invalid input.
//            System.out.println("Invalid input: You may not enter an empty return.");
//            validateUserGuess(randomNumber, input);
//        }

        ++guessCounter;
        // Confirm user guess is integer
        if (!input.hasNextInt()) {
            input.nextLine(); // This clear the scanner of invalid input.
            System.out.println("Invalid input: Your guess must be an integer between 1 and 100.");
            validateUserGuess(randomNumber, input, guessCounter);
        } else {
            // Confirm user guess is in range
            int userInput = Integer.parseInt(input.nextLine());
            if (userInput < 1 || userInput > 100) {
                System.out.println("Invalid input: Your guess must be between 1 and 100.");
                validateUserGuess(randomNumber, input, guessCounter);
            } else {
                processUserGuess(randomNumber, userInput, input, guessCounter);
            }
        }
    }

    public static void processUserGuess(int randomNumber, int userInput, Scanner input, int guessCounter) {
        if (userInput > randomNumber) {
            System.out.println("LOWER");
            validateUserGuess(randomNumber, input, guessCounter);
        } else if (userInput < randomNumber) {
            System.out.println("HIGHER");
            validateUserGuess(randomNumber, input, guessCounter);
        } else {
            System.out.format("GOOD GUESS! You figured it out in %d guesses.%n", guessCounter);
        }
    }
}
