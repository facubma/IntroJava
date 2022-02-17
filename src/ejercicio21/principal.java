package ejercicio21;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        int n;
        int num;
        System.out.print("Ingrese el tamaño del vector (N elementos): ");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        n = leer.nextInt();
        int vector[] = new int[n]; //0 a N-1
        for(int i = 0; i <= n - 1; i++){
            vector[i] = (int) (Math.random()*25)+1; //num aleatorios entre el 1 y el 25.
        }
        System.out.print("Ingrese un valor a buscar en el vector: ");
        num = leer.nextInt();
        
        System.out.println("");
        for(int i = 0; i <= n - 1; i++){
            System.out.print(vector[i] + " ");
        }
        System.out.println("\n");
        
        boolean found = false;
        for(int i = 0; i <= n - 1; i++){
            if(vector[i] == num){
                System.out.println("El numero " + num + " se encuentra en la posicion " + i);
                found = true;
            }
        }
        if(found == false){
            System.out.println("No se encontró el numero " + num);
        }
    }
    
}
