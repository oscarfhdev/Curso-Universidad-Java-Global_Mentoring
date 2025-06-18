import java.util.Arrays;
import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        // Arreglos
        // 1. Declaramos un arreglo
        int[] enteros;

        // 2. Inicializamos el arreglo
        enteros = new int[0];

        // Declarar e inicializar un arreglo
        int[] numeros = new int[2];


        var enteros2 = new int[5];

        //Modificamos los elementos
        enteros2[0] = 13;
        enteros2[1] = 21;
        enteros2[4] = 62;

        // Leer los elementos de un arreglo
        System.out.println("Valor 1 = " + enteros2[0]);
        System.out.println("Valor 2 = " + enteros2[1]);
        System.out.println("Valor 5 = " + enteros2[4]);


        // int[] nuevoArreglo = {0,10,11};
        var nuevoArreglo = new int[] {0,10,11};
        System.out.println("\nValor 1 = " + nuevoArreglo[0]);
        System.out.println("Valor 2 = " + nuevoArreglo[1]);
        System.out.println("Valor 3 = " + nuevoArreglo[2]);

        // Imprimir el arreglo, nos muestra la dirección de memoria
        System.out.println("Imprimir el arreglo: " + nuevoArreglo);

        // Iterar los elementos de un arreglo
        for (var i = 0; i < nuevoArreglo.length; i++)
            System.out.println("Valor del índice " + i + " = " + nuevoArreglo[i]);

        // Introducir valores a un arreglo
        var consola = new Scanner(System.in);

        // Declarar el arreglo
        System.out.print("\nProporciona el largo del arreglo: ");
        var largoArreglo = Integer.parseInt(consola.nextLine());

        // Creamos de manera dinámica el arreglo
        var enteros3 = new int[largoArreglo];

        // Solicitar los valores del arreglo
        for (var i = 0; i < largoArreglo; i++){
            System.out.print("Proporciona enteros [" + i + "] = " );
            enteros3[i] = Integer.parseInt(consola.nextLine());
        }

        // Imprimir los valores del arreglo
        System.out.println("\nImpresión del arreglo");
        for (int i = 0; i < largoArreglo; i++) {
            System.out.println("Valor del índice " + i + " = " + enteros3[i]);
        }
    }
}
