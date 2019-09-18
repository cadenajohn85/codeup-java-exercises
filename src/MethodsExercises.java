public class MethodsExercises {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

//    public static double divide(double num1, double num2) {
//        return num1 / num2;
//    }

    public static int divide(int num1, int num2) {
        if (num2 == 0) {
            // Can't return an error message;
            return 55555;
        } else {
            return num1 / num2;
        }
    }

    public static int modulo(int num1, int num2) {
        return num1 % num2;
    }

    public static void main(String[] Args) {
//        System.out.println(add(3, 7));
//        System.out.println(subtract(3, 7));
//        System.out.println(multiply(3, 7));
        // Divide only returns the quotient if the parameters are defined as int, even if the method returns a double.
//        System.out.println(divide(3, 7));
//        System.out.println(divide(8, 2));
//        System.out.println(divide(8, 3));
//        System.out.println(modulo(3, 7));
//        System.out.println(modulo(8, 2));
//        System.out.println(modulo(8, 3));
        System.out.println(divide(8, 0));




    }

}
