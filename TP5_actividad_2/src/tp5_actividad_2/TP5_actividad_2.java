package tp5_actividad_2;
public class TP5_actividad_2 {
    public static void main(String[] args) {
        int[][]matriz = new int [3][3];
        matriz[0][0]=1;
        matriz[0][1]=5;
        matriz[0][2]=4;
        matriz[1][0]=2;
        matriz[1][1]=4;
        matriz[1][2]=5;
        matriz[2][0]=1;
        matriz[2][1]=2;
        matriz[2][2]=3;
        for (int i = 0;i < 3;i++){
            for(int b = 0;b < 3;b++){
                System.out.print("["+matriz[i][b]+"]");
            }
        System.out.println( );
        }
        
    }
    
}
