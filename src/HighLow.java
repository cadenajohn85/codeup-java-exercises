import java.util.Scanner;

public class HighLow {

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
        if (input.next().toLowerCase().equals("y")) {
            System.out.println("I'm thinking of a number between 1 and 100. Guess my number:");
            playGame(input);
        } else {
            System.out.println("Thanks for playing. Have a nice day!");
        }
    }

    public static void validateUserGuess(int randomNumber, Scanner input, int guessCounter) {
        ++guessCounter;
        // Confirm user guess is integer
        if (!input.hasNextInt()) {
            input.next(); // This clear the scanner of invalid input.
            System.out.println("Invalid input: Your guess must be an integer between 1 and 100.");
            validateUserGuess(randomNumber, input, guessCounter);
        } else {
            // Confirm user guess is in range
            int userInput = Integer.parseInt(input.next());
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
