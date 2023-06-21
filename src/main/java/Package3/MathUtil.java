//Pakiet zawierający pomocnicze metody matematyczne
package Package3;

//Klasa MathUtil zawiera pomocnicze metody matematyczne
public class MathUtil {
    //Oblicza silnię liczby za pomocą zewnętrznej metody maven
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
    //Oblicza pierwiastek kwadratowy liczby
    public static double squareRoot(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Liczba musi być większa lub równa zero!");
        }
        return Math.sqrt(number);
    }
}