import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        // Definamos una matriz
        final var RENGLONES = 2;
        final var COLUMNAS = 3;

        //int[][] matriz = new int[2][3];
        var matriz = new int[RENGLONES][COLUMNAS];

        // Modificamos los valores de la matriz
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;

        // Accedemos a los valores
        System.out.println("Valor 1 [0][0] = " + matriz[0][0]);
        System.out.println("Valor 5 [1][1] = " + matriz[1][1]);
        System.out.println("Valor 6 [1][2] = " + matriz[1][2]);
        System.out.println();
        // Recorrer una matriz

        // 1. Ciclo externo, recorrer las filas
        for (var fila = 0; fila < RENGLONES; fila++){
            // 2. Ciclo interno, recorrer las columnas
            for (var columna = 0; columna < COLUMNAS; columna++)
                System.out.println("Valor[" + fila + "][" + columna + "] = " + matriz[fila][columna]);
        }

        // Definir con sintaxis simplificada
        var matriz2 = new int[][] {{600, 550, 320},
                                    {401, 5700, 600}
        };

        System.out.println();
        // Iterar la matriz sin las constantes
        for (var fila = 0; fila < matriz2.length; fila++){
            // 2. Ciclo interno, recorrer las columnas
            for (var columna = 0; columna < matriz2[fila].length; columna++)
                System.out.println("Valor[" + fila + "][" + columna + "] = " + matriz2[fila][columna]);
        }


        // Introducir variables a una matriz
        System.out.println("\n\n");
        int renglones, columnas;
        var consola = new Scanner(System.in);

        System.out.print("Proporciona los renglones que tendrá la matriz: ");
        var renglonesIntroducidos = Integer.parseInt(consola.nextLine());

        System.out.print("Proporciona las columnas que tendrá la matriz: ");
        var columnasIntroducidos = Integer.parseInt(consola.nextLine());

        var matriz3 = new int[renglonesIntroducidos][columnasIntroducidos];

        // Solicitamos los valores
        for (int i = 0; i < renglonesIntroducidos ; i++) {
            for (int j = 0; j < columnasIntroducidos; j++) {
                System.out.print("Valor[" + i + "][" + j + "] = ");
                matriz3[i][j] = Integer.parseInt(consola.nextLine());
            }
        }

        // Iterar los valores de la matriz
        System.out.println();
        for (int i = 0; i < renglonesIntroducidos; i++) {
            for (int j = 0; j < columnasIntroducidos ; j++) {
                System.out.println("Valor[" + i + "][" + j + "] = " + matriz3[i][j]);
            }
        }
    }
}
