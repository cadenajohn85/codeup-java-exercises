package movies;

import util.Input;

public class MoviesApplication {

    private static Input input = new Input();

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
        System.out.println("5 - view movies in the sci-fi cateogry");
        System.out.println("");
        processUserChoice(input.getInt(0, 5, "Enter your choice: "));
    }

    private static void processUserChoice(int userChoice) {
        switch (userChoice) {
            case 0:
                System.out.println("Thank you for using MoviesApplication.  Have a nice day!");
                break;
            case 1:
                for(Movie movie : MoviesArray.findAll()) {
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
                displayMenu();
                break;
            case 2:
                for(Movie movie : MoviesArray.findAll()) {
                    if (movie.getCategory().equals("animated")) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
                displayMenu();
                break;
            case 3:
                for(Movie movie : MoviesArray.findAll()) {
                    if (movie.getCategory().equals("drama")) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
                displayMenu();
                break;
            case 4:
                for(Movie movie : MoviesArray.findAll()) {
                    if (movie.getCategory().equals("horror")) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
                displayMenu();
                break;
            case 5:
                for(Movie movie : MoviesArray.findAll()) {
                    if (movie.getCategory().equals("scifi")) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
                displayMenu();
                break;
            default:
                //Question -- is this the best option? (already done above) Better to force exit?
                processUserChoice(input.getInt(0, 5, "Enter your choice: "));
//                System.out.println("I didn't understand your menu choice. Please try again.");
                break;
        }

    }

}
