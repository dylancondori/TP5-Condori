package tp5_actividad_5;
import java.util.Scanner;
public class TP5_actividad_5 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        String[][]mat= new String[3][3];

        for (int i=0;i<3;i++) {

            for (int j=0;j<3;j++) {

                if (j % 2 == 0) {

                    System.out.print("Ingrese un nombre de la posicion actual [" + i + "][" + j + "]: ");

                    mat[i][j] = n.nextLine();

                }

                else {

                    System.out.print("Ingrese un numero de la posicion actual [" + i + "][" + j + "]: ");

                    mat[i][j] = n.nextLine();

                }

            }

        }

        for (int i=0;i<3;i++) {

            for (int j=0;j<3;j++) {

                System.out.print("[" + mat[i][j] + "]");

            }

            System.out.println();

        }
    }
    
}
