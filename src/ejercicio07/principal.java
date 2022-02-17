package ejercicio07;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        int num;
        System.out.print("Ingrese un numero: ");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        num = leer.nextInt();
        if (num % 2 == 0) {
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }
    }
    
}
