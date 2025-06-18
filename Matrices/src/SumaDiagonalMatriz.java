import java.util.Arrays;
import java.util.Scanner;

public class SumaDiagonalMatriz {
    public static void main(String[] args) {
        System.out.println("*** Suma de la Diagonal de una Matriz ***");

        var consola = new Scanner(System.in);

        System.out.println("Ingresa los valores de la matriz");
        System.out.print("Proporciona las filas: ");
        var filas = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona las columnas: ");
        var columnas = Integer.parseInt(consola.nextLine());

        var matriz = new int[filas][columnas];
        var sumaDiagonal = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas ; j++) {
                System.out.print("Ingresa el valor [" + i +"][" + j + "] : " );
                int valorIngresado = consola.nextInt();
                matriz[i][j] = valorIngresado;
                if (i == j){
                    sumaDiagonal += matriz[i][j];
                }
            }
        }

        System.out.println("La suma de la diagonal es : " + sumaDiagonal);
    }
}
