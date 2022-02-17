package ejercicio09;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        String cadena;
        System.out.print("Ingrese una frase o palabra: ");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        cadena = leer.next();
        int length = cadena.length();
        if (length == 8){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
    
}
