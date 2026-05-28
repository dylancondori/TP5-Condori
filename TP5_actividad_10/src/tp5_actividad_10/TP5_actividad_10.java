package tp5_actividad_10;
import java.util.Random;
public class TP5_actividad_10 {

    public static void main(String[] args) {
        int [][]temperaturas = new int[5][7];
        temperaturas = LlenarMatriz(temperaturas,7,38)
        for(int i = 0;i < 5;i++){
            for(int j = 0;j < 7;j++){
                System.out.print(temperaturas[i][j]);
            }
            System.out.println(  );
        }
    }
        static int[][] LlenarMatriz(int[][] Matriz, int mi, int max){
            Random Aleatorio = new Random();
            int contador = 0;
            for(int i; i < 5;i++){
                for(int j = 0;j < 7;j++){
                Matriz[i][j] = Aleatorio.nextInt(min,max);
                contador = contador + 1;
                if(contador >= 31)break;
                   
            }
        }
            return Matriz;
    }
    static int[] BuscarExtremos(int[][]Matriz){
        
    }
    static float BuscarPromedio(int[][]Matriz){
        
    } 
}
