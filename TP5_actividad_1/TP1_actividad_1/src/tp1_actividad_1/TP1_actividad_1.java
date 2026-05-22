package tp1_actividad_1;
public class TP1_actividad_1 {
    public static void main(String[] args) {
        int[][]matriz = new int [2][2];
        matriz[0][0] = 4;
        matriz[0][1]= 5;
        matriz[1][0]=3;
        matriz[1][1]=2;
        for (int i = 0;i < 2;i++){
            for(int b = 0;b < 2;b++){
                System.out.print("["+matriz[b][i]+"]");
            }
        System.out.println( );
        }
    }
    
}
