package ejercicio03;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        System.out.print("Ingrese una frase: ");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String frase = leer.next();
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
    
}
