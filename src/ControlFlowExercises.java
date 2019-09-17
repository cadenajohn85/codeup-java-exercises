import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

//        Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//                Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0

        boolean userWantsToContinue = true;
        while (userWantsToContinue) {
            System.out.println("Please enter a number grade:");
            int userGrade = Integer.parseInt(input.nextLine());
            if (userGrade >= 88 && userGrade <= 100) {
                System.out.println("The grade equates to an A.");
            }
            else if (userGrade >= 80 && userGrade <= 87) {
                System.out.println("The grade equates to a B.");
            }
            else if (userGrade >= 67 && userGrade <= 79) {
                System.out.println("The grade equates to a C.");
            }
            else if (userGrade >= 60 && userGrade <= 66) {
                System.out.println("The grade equates to a D.");
            }
            else {
                System.out.println("The grade equates to an F.");
            }
            System.out.println("Would you like to enter another grade? [ y | n ]");
            String userChoice = input.nextLine();
            if (!userChoice.equalsIgnoreCase("y")) {
                userWantsToContinue = false;
            }
        }




    }

}
