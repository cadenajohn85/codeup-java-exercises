import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        boolean wantsToContinue = true;

        while (wantsToContinue) {
            System.out.println("What number would you like to go up to?");
            int userInt = Integer.parseInt(input.nextLine());
            System.out.println("Here is your table!\n");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (int i = 1; i <= userInt; i++ ) {
                System.out.format("%s      | %s       | %s%n", i, i*i, i*i*i);
            }
            // Check if user wants to continue
            System.out.println("Would you like to continue? [ y | n ]");
            String userChoice = input.nextLine();
            if (!userChoice.equalsIgnoreCase("y")) {
                break;
            }
        }




    }

}
