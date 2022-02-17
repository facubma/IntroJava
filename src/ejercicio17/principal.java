package ejercicio17;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        int tam;
        System.out.println("Cuadrado: \n");
        System.out.print("Ingrese cantidad de '*' por lado: ");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        tam = leer.nextInt();
        for(int i = 0; i <= tam; i++){
            for(int j = 0; j <= tam; j++){
                if(i == 0 || j == 0 || i == tam || j == tam){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
