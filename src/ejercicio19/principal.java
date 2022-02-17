package ejercicio19;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        double moneda;
        String cambio;
        System.out.print("Divisa Euro: ");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        moneda = leer.nextDouble();
        System.out.print("Ingrese la moneda de cambio: ");
        cambio = leer.next();
        cambioDivisa(moneda,cambio);
    }
    
    public static void cambioDivisa(double moneda, String cambio){
        String aux;
        aux = cambio.toLowerCase();
        switch(aux){
            case "libra":
            case "libras":
                System.out.print("El cambio de divisas es:\n");
                System.out.print("* " + moneda*0.86 + " libras es " + moneda + " €\n");
                break;
            case "dolar":
            case "dolares":
                System.out.print("El cambio de divisas es:\n");
                System.out.print("* " + moneda*1.28 + " dolares es " + moneda + " €\n");
                break;
            case "yen":
            case "yenes":
                System.out.print("El cambio de divisas es:\n");
                System.out.print("* " + moneda*129.85 + " yenes es " + moneda + " €\n");
                break;
            default:
                System.out.println("ERROR - La divisa ingresada no es válida.");
                System.out.println("/0000000000000000000000000000000000000000000/");
        }
    }
}
