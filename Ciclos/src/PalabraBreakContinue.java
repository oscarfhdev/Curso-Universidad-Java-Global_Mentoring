public class PalabraBreakContinue {
    public static void main(String[] args) {
        System.out.println("*** Break y Continue ***");

        // Ejemplo break, imprimir solo el primer
        for (var numero = 1; numero < 10; numero++){
            if (numero % 2 == 0){
                System.out.print(numero + " ");
                break;
            }
        }

        // Ejemplo con continue. Imprimir solo números pares, ignorar impares
        System.out.println("\nPalabra Continue: ");
        for (var numero = 1; numero < 10; numero++){
            if (numero % 2 == 1) //númeo impar
                continue; //Saltamos a la siguiente iteración

            System.out.print(numero + " "); // números pares
        }
    }
}
