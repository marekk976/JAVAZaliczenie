package PackageTest;

import Package1.Calculator;
import Package2.InputValidator;
import Package3.MathUtil;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        InputValidator inputValidator = new InputValidator();

        System.out.print("Wpisz liczbę nr 1: ");
        int a = scanner.nextInt();

        System.out.print("Wpisz liczbę nr 2: ");
        int b = scanner.nextInt();

        System.out.println("Suma: " + calculator.add(a, b));
        System.out.println("Różnica: " + calculator.subtract(a, b));
        System.out.println("Iloczyn: " + calculator.multiply(a, b));

        try {
            System.out.println("Iloraz: " + calculator.divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Błąd dzielenia: " + e.getMessage());
        }

        if (inputValidator.isNumber(Integer.toString(a))) {
            System.out.println("Pierwiastek kwadratowy pierwszej liczby: " + calculator.squareRoot(a));
        } else {
            System.out.println("Pierwsza liczba nie jest liczbą.");
        }

        if (inputValidator.isNumber(Integer.toString(b))) {
            System.out.println("Pierwiastek kwadratowy drugiej liczby: " + calculator.squareRoot(b));
        } else {
            System.out.println("Druga liczba nie jest liczbą.");
        }

        System.out.println("Silnia pierwszej liczby: " + MathUtil.factorial(a));
        System.out.println("Silnia drugiej liczby: " + MathUtil.factorial(b));

        System.out.println("Największy wspólny dzielnik: " + calculator.greatestCommonDivisor(a, b));

        scanner.close();
    }
}
