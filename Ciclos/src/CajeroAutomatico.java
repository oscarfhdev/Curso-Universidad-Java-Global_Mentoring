import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {

        var saldo = 1000.0;
        var consola = new Scanner(System.in);

        // Menú del cajero
        var salir = false;
        while (!salir){
            System.out.print("""
                    \n
                    *** Aplicación de Cajero Automático ***
                    1. Consultar saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Escoge una opción:\s""");


            var opcion = Integer.parseInt(consola.nextLine());

            // Tomamos la decisión según la opción
            switch (opcion){
                case 1 -> System.out.printf("Tu saldo actual es %.2f€ %n" , saldo);

                case 2 ->{
                    System.out.print("Ingresa el monto a retirar: ");
                    var saldoARetirar = Double.parseDouble(consola.nextLine());
                    if (saldoARetirar < saldo){
                        saldo -= saldoARetirar;
                        System.out.printf("Tu nuevo saldo es de: %.2f %n" , saldo);
                    }
                }
                case 3 -> {
                    System.out.print("Ingresa el monto a depositar: ");
                    var saldoADepositar = Double.parseDouble(consola.nextLine());
                    saldo += saldoADepositar;
                    System.out.printf("Tu nuevo saldo es de: %.2f %n" , saldo);
                }
                case 4 -> {
                    System.out.println("Saliendo del programa...");
                    salir = true;
                }
                default -> System.out.println("Selecciona otra opción. ¡Opción incorrecta!");
            }
        }
    }
}
