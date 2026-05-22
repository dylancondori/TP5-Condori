package tp5_actividad_4;
import java.util.Scanner;
public class TP5_actividad_4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = 0;
        int s = 0;
        System.out.println("Ingrese el numero de filas");
        n = num.nextInt();
        System.out.println("Ingrese el numero de columnas");
        s = num.nextInt();
        String [][]matriz = new String [n][s];
        num.nextLine();
        for(int u = 0;u < n;u++){
            for(int o = 0; o < s;o++){
                System.out.println("Ingrese el numero de la fila "+u+" y de la columna "+o);
                matriz[u][o]=num.nextLine();
            }
        }
        for(int z = 0;z < n;z++){
            for(int y = 0;y < s;y++){
                System.out.print("["+matriz[z][y]+"]");
            }
            System.out.println( );
        }
    }
    
}
