package ejercicio22;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        int n;
        int uno = 0;
        int dos = 0;
        int tres = 0;
        int cuatro = 0;
        int cinco = 0;
        System.out.print("Ingrese el tamaño del vector: ");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        n = leer.nextInt();
        int vector[] = new int[n];
        for(int i = 0; i <= n - 1; i++){
            vector[i] = (int) (Math.random()*99999)+1; //numeros entre el 1 hasta 99999 - 1 a 5 cifras.
        }
        for(int i = 0; i <= n - 1; i++){
            if(vector[i]<10){
                uno += 1;
            } else if(vector[i]>9 && vector[i]<100){
                dos += 1;
            } else if(vector[i]>99 && vector[i]<1000){
                tres += 1;
            } else if(vector[i]>999 && vector[i]<10000){
                cuatro += 1;
            } else if(vector[i]>9999 && vector[i]<100000){
                cinco += 1;
            }
        }
        System.out.println("");
        for(int i = 0; i <= n - 1; i++){
            System.out.print(vector[i] + " ");
        }
        System.out.println("\n");
        System.out.println("1 Digito: " + uno);
        System.out.println("2 Digitos: " + dos);
        System.out.println("3 Digitos: " + tres);
        System.out.println("4 Digitos: " + cuatro);
        System.out.println("5 Digitos: " + cinco);
    }
    
}
