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

    public static double divideDoubles(double num1, double num2) {
        return num1 / num2;
    }

    public static int divideInts(int num1, int num2) {
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

    public static int bonusMult(int num1, int num2) {
        int total = 0;
        for (int i = 0; i < java.lang.Math.abs(num1); i++) {
            total += num2;
        }
        if (num1 != java.lang.Math.abs(num1)) {
            total = 0 - total;
        }
        return total;
    }

    public static int recursiveMult(int num1, int num2) {
        // If both numbers are negative, turn them positive
        if (Integer.signum(num1) == -1 && Integer.signum(num2) == -1) {
            num1 = java.lang.Math.abs(num1);
            num2 = java.lang.Math.abs(num2);
        }
        // If number2 is negative, avoid stack overflow by swapping values of num1 and num2
        if (Integer.signum(num2) == -1) {
            int placeholder = num1;
            num1 = num2;
            num2 = placeholder;
        }
        // Normal recursive conditions
        if (num2 == 0) {
            return 0;
        }
        return num1 + recursiveMult(num1, num2 - 1);
    }

    public static void main(String[] Args) {
//        System.out.println(add(3, 7));
//        System.out.println(subtract(3, 7));
//        System.out.println(multiply(3, 7));
    // Divide only returns the quotient if the parameters are defined as int, even if the method returns a double.
//        System.out.println(divideDoubles(3, 7));
//        System.out.println(divideInts(3, 7));
//        System.out.println(modulo(8, 3));

        System.out.println(divideDoubles(8, 0));
        System.out.println(divideInts(8, 0));

//        System.out.println(bonusMult(4, 7));
//        System.out.println(recursiveMult(9, -5));










    }

}
