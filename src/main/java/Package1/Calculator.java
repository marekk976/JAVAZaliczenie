package Package1;

import org.apache.commons.math3.util.ArithmeticUtils;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Nie dzielimy przez 0!");
        }
        return (double) a / b;
    }

    public double squareRoot(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Liczba musi być większa lub równa zero!");
        }
        return Math.sqrt(a);
    }

    public int greatestCommonDivisor(int a, int b) {
        return ArithmeticUtils.gcd(a, b);
    }
}
