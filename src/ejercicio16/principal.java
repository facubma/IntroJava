package ejercicio16;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        String cadena = ".";
        String init;
        String end;
        String FDE = "&&&&&";
        int valid = 0;
        int inv = 0;
        System.out.println("Sistema RS232\n");
        System.out.println("Lecturas: \n");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        while(!(cadena.equals(FDE))){
            cadena = leer.next();
            if(cadena.length() == 5){
                init = cadena.substring(0,1);
                end = cadena.substring(4,5); //Si en teoría usamos 5 caracteres y java se maneja de 0 a N incluyendo el caracter nulo \0.
                if((init.equals("X"))&&(end.equals("O"))){
                    valid = valid + 1;
                } else if(!(cadena.equals(FDE))){
                    inv = inv + 1;
                }
            } else {
                inv = inv + 1;
            }
        }
        System.out.println("\nLecturas correctas: " + valid);
        System.out.println("\nLecturas incorrectas: " + inv);
    }
}
