import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        // Leer tipos de datos

        // Leer un tipo int
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);

        // Leer un tipo double
        System.out.print("Ingresa tu altura: ");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);

        // Leer un tipo String
        System.out.print("Ingresa tu nombre: ");
        // Consumimos el caracter de salto de línea
        consola.nextLine();
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);


        // Conversion de datos
        System.out.print("Proporciona un valor entero: ");
        var enteroString = consola.nextLine();
        var entero = Integer.parseInt(enteroString);
        System.out.println("entero = " + entero);

        // Tipo flotante
        System.out.print("Proporciona un valor flotante: ");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);

        // Double.parseDouble();
        // Boolean.parseBoolean();
    }
}
