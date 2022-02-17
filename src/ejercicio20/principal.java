package ejercicio20;

public class principal {

    public static void main(String[] args) {
        int enteros[] = new int[100];
        int num = 0;
        for(int i = 0; i <= 99; i++){
            enteros[i] = num;
            num += 1;
        }
        for(int i = 99; i >= 0; i--){
            if(i==0){
                System.out.println(" " + enteros[i]);
            }else{
                System.out.print(" " + enteros[i]);   
            }
        }
    }
    
}
