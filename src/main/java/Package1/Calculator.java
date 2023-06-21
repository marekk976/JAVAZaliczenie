//Pakiet zawierający klasy do przeprowadzania podstawowych operacji matematycznych
package Package1;

import org.apache.commons.math3.util.ArithmeticUtils;
//Klasa Calculator umożliwia wykonywanie podstawowych operacji matematycznych

public class Calculator {
    //Dodaje dwie liczby
    public int add(int a, int b) {
        return a + b;
    }
    //Odejmuje drugą liczbę od pierwszej liczby
    public int subtract(int a, int b) {
        return a - b;
    }
    //Mnoży dwie liczby
    public int multiply(int a, int b) {
        return a * b;
    }
    //Dzieli pierwszą liczbę przez drugą liczbę
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Nie dzielimy przez 0!");
        }
        return (double) a / b;
    }
    //Oblicza pierwiastek kwadratowy liczby
    public double squareRoot(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Liczba musi być większa lub równa zero!");
        }
        return Math.sqrt(a);
    }
    //Oblicza największy wspólny dzielnik dwóch liczb
    public int greatestCommonDivisor(int a, int b) {
        return ArithmeticUtils.gcd(a, b);
    }
}
