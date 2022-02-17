package ejercicio13;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        int limite;
        int val;
        int acu = 0;
        System.out.print("Ingrese un valor limite positivo: ");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        limite = leer.nextInt();
        while(acu <= limite){
            System.out.println("Ingrese un valor: ");
            val = leer.nextInt();
            acu = acu + val;
        }
        System.out.println("Superado el valor limite " + limite);
    }
    
}
