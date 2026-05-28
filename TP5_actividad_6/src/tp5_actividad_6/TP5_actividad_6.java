package tp5_actividad_6;
import java.util.Scanner;
public class TP5_actividad_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] p1 = new String[4][3];
        p1[0][0]="Nombre";
        p1[0][1]="Edad";
        p1[0][2]="Sueldo";
        for (int i=1;i<4;i++) {
            for (int j=0;j<3;j++) {
                if (j==0) {
                    System.out.print("Ingrese un nombre, posicion actual [" + i + "][" + j + "]: ");
                    p1[i][j] = scanner.nextLine();
                }
                else if(j==1) {
                    System.out.print("Ingrese la edad, posicion actual [" + i + "][" + j + "]: ");
                    p1[i][j] = scanner.nextLine();
                }
                else{
                    System.out.print("Ingrese el sueldo, posicion actual [" + i + "][" + j + "]: ");
                    p1[i][j] = scanner.nextLine();
                }
            }
        }
        for (int i=0;i<4;i++) {
            for (int j=0;j<3;j++) {
                System.out.print("[" + p1[i][j] + "] ");
            }
            System.out.println();
        }
    }
    
}
