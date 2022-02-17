package ejercicio08;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        String str = "eureka";
        String frase;
        System.out.print("Ingrese una frase: ");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        frase = leer.next();
        if(str.equals(frase)){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
    
}
