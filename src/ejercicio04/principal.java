package ejercicio04;

import java.util.Locale;
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        float C;
        float F;
        System.out.print("Ingrese la temperatura en grados Centigrados: ");
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        C = leer.nextFloat();
        F = 32 + (9 * C / 5);
        System.out.println("\nTemperatura en grados Fahrenheit: " + F);
    }
    
}
