package ejercicio12;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        int nota = -1;
        while(nota < 0 || nota > 10){
            System.out.print("Ingrese una nota (0 - 10): ");
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            nota = leer.nextInt();
            //Runtime.getRuntime().exec("cls");
        }
    }
    
}
