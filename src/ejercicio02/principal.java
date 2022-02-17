package ejercicio02;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        System.out.print("Ingrese su nombre: ");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String nombre = leer.next();
        System.out.println("\nNombre: " + nombre);
    }
}
