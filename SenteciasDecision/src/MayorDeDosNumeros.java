import java.util.Scanner;

public class MayorDeDosNumeros {
    public static void main(String[] args) {
        System.out.println("*** Sistema Comparador de Números ***");

        var consola = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        var primerNumero = Double.parseDouble(consola.nextLine());

        System.out.print("Ingresa el segundo número: ");
        var segundoNumero = Double.parseDouble(consola.nextLine());

        if (primerNumero > segundoNumero){
            System.out.println("El número " + primerNumero + " es más grande qué " + segundoNumero);
        } else if (segundoNumero > primerNumero) {
            System.out.println("El número " + segundoNumero + " es más grande qué " + primerNumero);
        }
        else {
            System.out.println("Los dos números tienen el mismo valor, son iguales");
        }
    }
}
