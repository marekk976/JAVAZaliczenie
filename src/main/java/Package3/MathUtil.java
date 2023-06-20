package Package3;

public class MathUtil {
    public static int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Liczba musi być większa lub równa zero!");
        }

        if (number == 0) {
            return 1;
        }

        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static double squareRoot(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Liczba musi być większa lub równa zero!");
        }
        return Math.sqrt(number);
    }
}