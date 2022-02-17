package ejercicio23;

public class principal {
    public static void main(String[] args) {
        int matriz[][] = new int[4][4]; //0 a 3 = 4
        int vector[];
        vector = new int[16];
        int i,j,k;
        for(i = 0; i <= 3; i++){
            for(j = 0; j <= 3; j++){
                matriz[i][j] = (int) (Math.random()*20); //0 a 20
            }
        }
        System.out.println("Matriz:");
        System.out.println("-----------");
        for(i = 0; i <= 3; i++){
            for(j = 0; j <= 3; j++){
                if(j == 3){
                    System.out.println(matriz[i][j]);
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        i = 0;
        for(j = 0; j <= 3; j++){
            for(k = 0; k <= 3; k++){
                vector[i] = matriz[j][k];
                i += 1;
            }
        }
        i = 0;
        for(j = 0; j <= 3; j++){
            for(k = 0; k <= 3; k++){
                matriz[k][j] = vector[i];
                i += 1;
            }
        }
        System.out.println("\nMatriz Transpuesta:");
        System.out.println("-----------");
        for(i = 0; i <= 3; i++){
            for(j = 0; j <= 3; j++){
                if(j == 3){
                    System.out.println(matriz[i][j]);
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }
    
}
