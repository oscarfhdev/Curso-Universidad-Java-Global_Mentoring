import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        /*
        var salir = false;
        var consola = new Scanner(System.in);
        float operando1 = 0, operando2 = 0, resultado;

        while (!salir){
            System.out.print("""
                    \n*** Calculadora en Java ***
                    Operaciones que puedes realizar:
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    Escoge una opción:\s""");

            var opcion = consola.nextInt();

            switch (opcion){
                case 1 ->{
                    System.out.print("\nIntroduce el valor 1: ");
                     operando1 = consola.nextFloat();
                    System.out.print("Introduce el valor 2: ");
                     operando2 = consola.nextFloat();

                    System.out.printf("La suma de %.2f y %.2f es %.2f%n", operando1, operando2, operando1 + operando2);
                }

                case 2 ->{
                    System.out.print("\nIntroduce el valor 1: ");
                    operando1 = consola.nextFloat();
                    System.out.print("Introduce el valor 2: ");
                    operando2 = consola.nextFloat();

                    System.out.printf("La resta de %.2f y %.2f es %.2f%n", operando1, operando2, operando1 - operando2);
                }

                case 3 ->{
                    System.out.print("\nIntroduce el valor 1: ");
                    operando1 = consola.nextFloat();
                    System.out.print("Introduce el valor 2: ");
                    operando2 = consola.nextFloat();

                    System.out.printf("La multiplicación de %.2f y %.2f es %.2f%n", operando1, operando2, operando1 * operando2);
                }

                case 4 ->{
                    System.out.print("\nIntroduce el valor 1: ");
                    operando1 = consola.nextFloat();
                    System.out.print("Introduce el valor 2: ");
                    operando2 = consola.nextFloat();

                    if (operando2 == 0) {
                        System.out.println("Error: División por cero");
                        break;
                    }

                    System.out.printf("La división de %.2f / %.2f es %.2f%n", operando1, operando2, operando1 / operando2);
                }

                case 5 ->{
                    System.out.println("\nSaliendo de la calculadora");
                    salir = true;
                }
                default -> System.out.println("Opción inválida, " + opcion + " selecciona otra opción");
            }
        }

         */

        var consola = new Scanner(System.in);
        double operando1 = 0, operando2 = 0, resultado;
        var salir = false;
        // Ciclo para la aplicacion de Calculadora
        while(!salir){
            System.out.print("""
                    *** Calculadora en Java ***
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    Escoge una opción:\s""");
            var opcion = consola.nextInt();

            if(opcion >= 1 && opcion <= 4){
                System.out.print("Dame el valor 1: ");
                operando1 = consola.nextDouble();
                System.out.print("Dame el valor 2: ");
                operando2 = consola.nextDouble();
            }

            switch(opcion){
                case 1 -> { // Suma
                    resultado = operando1 + operando2;
                    System.out.printf("Resultado suma: %.2f%n%n", resultado);
                }
                case 2 -> { // Resta
                    resultado = operando1 - operando2;
                    System.out.printf("Resultado resta: %.2f%n%n", resultado);
                }
                case 3 -> { // Multiplicación
                    resultado = operando1 * operando2;
                    System.out.printf("Resultado multiplicación: %.2f%n%n", resultado);
                }
                case 4 -> { // División
                    if(operando2 != 0) {
                        resultado = operando1 / operando2;
                        System.out.printf("Resultado división: %.2f%n%n", resultado);
                    }
                    else
                        System.out.println("Error: División entre cero.\n");
                }
                case 5 -> { // Salir
                    System.out.println("Saliendo del programa de Calculadora!");
                    salir = true;
                }
                default -> System.out.println("Opción inválida, " +
                        "selecciona otra opción...\n");
            }
        }
    }
}
