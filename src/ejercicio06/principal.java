package ejercicio06;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        int a;
        int b;
        System.out.print("Ingrese el primer numero: ");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        a = leer.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        b = leer.nextInt();
        if (a > b) {
            System.out.println("El numero mayor es: " + a);
        } else if (a < b){
            System.out.println("El numero mayor es: " + b);
        } else {
            System.out.println("Los numeros son iguales.");
        }
    }
    
}
