package ejercicio15;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        int num;
        int aux = 0;
        int cont = 0;
        System.out.println("Ingrese 20 numeros:\n");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        while(cont <= 20){
            num = leer.nextInt();
            aux = aux + num;
            cont = cont + 1;
            if(num == 0){
                System.out.println("\nSe capturó el numero cero.");
                break;
            }
        }
        System.out.print("Suma: " + aux + "\n");
    }
    
}
