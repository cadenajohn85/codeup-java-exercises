package movies;

import util.Input;
import java.util.Arrays;

public class MoviesApplication {

    private static Input input = new Input();
    private static Movie[] currentMovieList = MoviesArray.findAll();

    public static void main(String[] args) {
        displayMenu();
    }

    private static void displayMenu() {
        System.out.println("");
        System.out.println("What would you like to do?");
        System.out.println("");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the musical category");
        System.out.println("6 - view movies in the sci-fi category");
        System.out.println("7 - add a new movie");
        System.out.println("");
        processUserChoice(input.getInt(0, 7, "Enter your choice: "));
    }

    private static void processUserChoice(int userChoice) {
        switch (userChoice) {
            case 0:
                System.out.println("Thank you for using MoviesApplication.  Have a nice day!");
                break;
            case 1:
                for (Movie movie : currentMovieList) {
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
                displayMenu();
                break;
            case 2:
                for (Movie movie : currentMovieList) {
                    if (movie.getCategory().equals("animated")) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
                displayMenu();
                break;
            case 3:
                for (Movie movie : currentMovieList) {
                    if (movie.getCategory().equals("drama")) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
                displayMenu();
                break;
            case 4:
                for (Movie movie : currentMovieList) {
                    if (movie.getCategory().equals("horror")) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
                displayMenu();
                break;
            case 5:
                for (Movie movie : currentMovieList) {
                    if (movie.getCategory().equals("musical")) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
                displayMenu();
                break;
            case 6:
                for (Movie movie : currentMovieList) {
                    if (movie.getCategory().equals("scifi")) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
                displayMenu();
                break;
            case 7:
                addNewMovie();
                break;
            // No default case because getInt prevents the user from giving an integer outside the range of the menu options
        }
    }

    private static void addNewMovie() {
        String userMovieName = input.getString("What is the name of the new movie?");
        displayAddMovieMenu();
        int userMovieCategory = input.getInt(1, 6, "Please enter a number from the menu above:");
        switch (userMovieCategory) {
            case 1:
                currentMovieList = Arrays.copyOf(currentMovieList, currentMovieList.length + 1);
                currentMovieList[currentMovieList.length - 1] = new Movie(userMovieName, "animated");
                displayMenu();
                break;
            case 2:
                currentMovieList = Arrays.copyOf(currentMovieList, currentMovieList.length + 1);
                currentMovieList[currentMovieList.length - 1] = new Movie(userMovieName, "drama");
                displayMenu();
                break;
            case 3:
                currentMovieList = Arrays.copyOf(currentMovieList, currentMovieList.length + 1);
                currentMovieList[currentMovieList.length - 1] = new Movie(userMovieName, "horror");
                displayMenu();
                break;
            case 4:
                currentMovieList = Arrays.copyOf(currentMovieList, currentMovieList.length + 1);
                currentMovieList[currentMovieList.length - 1] = new Movie(userMovieName, "musical");
                displayMenu();
                break;
            case 5:
                currentMovieList = Arrays.copyOf(currentMovieList, currentMovieList.length + 1);
                currentMovieList[currentMovieList.length - 1] = new Movie(userMovieName, "scifi");
                displayMenu();
                break;
            case 6:
                displayMenu();
                break;
            // No default case because getInt prevents the user from giving an integer outside the range of the menu options
        }
    }

    private static void displayAddMovieMenu() {
        System.out.println("Your options for genre are:");
        System.out.println("1 -- animated");
        System.out.println("2 -- drama");
        System.out.println("3 -- horror");
        System.out.println("4 -- musical");
        System.out.println("5 -- sci-fi");
        System.out.println("6 -- cancel and return to main menu");
    }

}