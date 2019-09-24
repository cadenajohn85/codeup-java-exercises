// This is a place to try out code.

import java.util.Scanner;

public class BonusSandbox {

     public static void main(String[] args) {
//                     int x = 5;
//                     System.out.println(x > 4 ? x < 2 ? 10 : 8 : 7);
//                     //             Both are true : only first is true : first is false

         fizzBuzzLoop(1);

                 }

//    public static void fizzBuzzLoop(int i) {
//        if (i == 100) {
//            System.out.println(i);
//        } else if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//                i++;
//                fizzBuzzLoop(i);
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//                i++;
//                fizzBuzzLoop(i);
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//                i++;
//                fizzBuzzLoop(i);
//            } else {
//                System.out.println(i);
//                i++;
//                fizzBuzzLoop(i);
//            }
//        }
//    }

     public static int fizzBuzzLoop(int i) {
         if (i % 3 == 0 && i % 5 == 0) {
             System.out.println("FizzBuzz");
         } else if (i % 3 == 0) {
             System.out.println("Fizz");
         } else if (i % 5 == 0) {
             System.out.println("Buzz");
         } else {
             System.out.println(i);
         }
         if (i == 100) {
             return 0;
         } else {
             return fizzBuzzLoop(i + 1);
         }
     }
}

