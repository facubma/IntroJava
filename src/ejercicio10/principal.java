package ejercicio10;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        String frase;
        String sub;
        String letra = "A";
        System.out.print("Ingrese una frase: ");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        frase = leer.next();
        sub = frase.substring(0,1);
        if (sub.equals(letra)){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
    
}
