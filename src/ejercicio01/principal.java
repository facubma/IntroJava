package ejercicio01;

import java.util.Locale; //Se importa el util Locale o hay error en el new scanner useLocale
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        int val1;
        int val2;
        int sum;
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.print( "Ingrese el primer entero: " );
        val1 = leer.nextInt();
        System.out.print( "Ingrese el segundo entero: " );
        val2 = leer.nextInt();
        sum = val1 + val2;
        System.out.printf( "Suma es igual a %d\n", sum );
    }
}
