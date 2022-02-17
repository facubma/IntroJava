package ejercicio24;

public class principal {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        int i,j,k;
        for(i = 0; i<=2; i++){
            for(j = 0; j<=2; j++){
                matriz[i][j] = (int) (Math.random()*20); //Carga matriz original
            }
        }
        int antisimetrica[][] = new int[3][3];
        int vector[] = new int[9];
        i = 0;
        for(j = 0; j<=2; j++){
            for(k = 0; k<=2; k++){
                vector[i] = matriz[j][k]; //Carga lineal por filas de la matriz original
                i += 1;
            }
        }
        i = 0;
        for(j = 0; j<=2; j++){
            for(k = 0; k<=2; k++){
                antisimetrica[k][j] = vector[i] * (-1); //Carga inversa por columnas + negativo
                i += 1;
            }
        }
        i = 0;
        boolean eq = true;
        for(j = 0; j<=2; j++){
            for(k = 0; k<=2; k++){
                if(vector[i] != antisimetrica[j][k]){
                    eq = false; //recorre fila por fila de los elementos originales en el vector y los compara fila a fila con anti
                }
            }
        }
        if(eq == false){
            System.out.println("La matriz es antisimétrica.");
        }else{
            System.out.println("La matriz no es antisimétrica."); //revisar logica, siempre tira antisimetrica.
        }
    }
    
}
