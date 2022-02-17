package ejercicio11;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        int tipoMotor;
        System.out.println("Motor tipo bomba para fluidos:\n");
        System.out.print("Ingrese un motor (1 - 4): ");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        tipoMotor = leer.nextInt();
        switch(tipoMotor){
            case 1:
                System.out.println("\nLa bomba es una bomba de agua.");
                break;
            case 2:
                System.out.println("\nLa bomba es una bomba de gasolina.");
                break;
            case 3:
                System.out.println("\nLa bomba es una bomba de hormigón.");
                break;
            case 4:
                System.out.println("\nLa bomba es una bomba de pasta alimenticia.");
                break;
            default:
                System.out.println("\nNo existe un valor valido para el tipo de bomba.");
        }
    }
    
}
