package ejercicio14;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        int a;
        int b;
        double res = 0;
        int menu = -1;
        System.out.print("Ingrese el primer numero: ");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        a = leer.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        b = leer.nextInt();
        while(menu != 5){
            System.out.println("\nMENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elija opcion: ");
            menu = leer.nextInt();
            switch(menu){
                case 1:
                    res = a + b;
                    break;
                case 2:
                    res = a - b;
                    break;
                case 3:
                    res = a * b;
                    break;
                case 4:
                    res = a / b;
                    break;
                case 5:
                    String ex;
                    System.out.print("\n¿Esta seguro que desea salir de programa? (S/N): ");
                    ex = leer.next();
                    switch (ex) {
                        case "S":
                        case "s":
                            menu = 5;
                            break;
                        case "N":
                        case "n":
                            menu = -1;
                            break;
                        default:
                            System.out.println("\nERROR - Opcion ingresada incorrecta.\n");
                            menu = -1;
                            break;
                    }
                    break;
                default:
                    System.out.println("\nERROR - Opcion ingresada incorrecta.\n");
            }
            if(menu >= 1 && menu <= 4){
                System.out.println("\nResultado: " + res + "\n");
            }
        }
    }   
}
