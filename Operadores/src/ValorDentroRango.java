import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        System.out.println("*** Valor Dentro de un Rango ***");
        // Definimos los límites
        final var MINIMO = 0;
        final var MAXIMO = 5;
        // Solicitar un valor entre 0 y 5
        System.out.print("Proporciona un dato entre 0 y 5: ");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine());
        // Verificar si el dato está dentro de rango
        var estaDentroRango = dato <= MAXIMO && dato >= MINIMO;
        System.out.println("estaDentroRango? = " + estaDentroRango);
    }
}
