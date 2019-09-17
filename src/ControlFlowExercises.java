import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        While
//
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15

//        int i = 5;
//
//        while (i <= 15) {
//            System.out.print(i + " ");
//            if (i == 15) {
//                System.out.print("\n");
//            }
//            i++;
//        }

//        Do While
//
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//
//        2
//        4
//        16
//        256
//        65536

//        int j = 0;
//        do {
//            System.out.println(j);
//            j += 2;
//
//        } while (j <= 100);

//        int k = 100;
//        do {
//            System.out.println(k);
//            k -= 5;
//        } while (k >= -10);

//        long m = 2;
//        do {
//            System.out.println(m);
////            m *= m;
//            m = m * m;
//        } while (m <= 1000000);

//        Refactor the previous two exercises to use a for loop instead.

//        for (int n = 5; n <= 15; n++) {
//            System.out.print(n + " ");
//            if (n == 15) {
//                System.out.print("\n");
//            }
//        }

//        for (int o = 0; o <= 100; o += 2) {
//            System.out.println(o);
//        }

//        for (int p = 100; p >= -10; p -= 5) {
//            System.out.println(p);
//        }

        //        long m = 2;
//        do {
//            System.out.println(m);
////            m *= m;
//            m = m * m;
//        } while (m <= 1000000);

        for (long q = 2; q < 1000000; q *= q) {
            System.out.println(q);
        }







    }

}
