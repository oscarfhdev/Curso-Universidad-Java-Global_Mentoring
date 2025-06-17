import java.util.Arrays;

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
    }
}
