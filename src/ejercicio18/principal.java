package ejercicio18;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        int num;
        System.out.println("Ingrese cuatro numeros:\n");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        for(int i = 0; i <= 3; i++){
            num = leer.nextInt();
            for(int j = 0; j <= num-1; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }   
    }
}
