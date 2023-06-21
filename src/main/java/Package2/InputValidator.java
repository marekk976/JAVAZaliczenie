//Pakiet zawierający klasy do walidacji danych wejściowych
package Package2;

//Klasa InputValidator zawiera metody do walidacji danych wejściowych
public class InputValidator {
    //Sprawdza, czy podany ciąg znaków jest liczbą
    public boolean isNumber(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}