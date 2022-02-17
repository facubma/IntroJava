package ejercicio05;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        int num;
        double resultado;
        System.out.print("Ingrese un numero: ");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        num = leer.nextInt();
        System.out.println("Doble: " + num*2);
        System.out.println("Triple: " + num*3);
        resultado = Math.sqrt(num);
        System.out.println("Raiz: " + resultado);
    }
    
}
