import java.util.Scanner;

public class SistemaAdministracionCuentas {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        var salir = false;

        while (!salir){
            System.out.print("""
                    *** Sistema de Administracion de Cuentas ***
                    Menú:
                    1. Crear cuenta
                    2. Eliminar cuenta
                    3. Salir
                    Escoge una opcion:\s""");

            var opcion = Integer.parseInt(consola.nextLine());

            // Evaluar cada opción
            switch (opcion){
                case 1 -> System.out.println("Creando tu cuenta... \n");
                case 2 -> System.out.println("Eliminando tu cuenta... \n");
                case 3 -> {
                    System.out.println("Saliendo del sistema. Hasta pronto!");
                    salir = true;
                }
                default -> System.out.println("Opción inválida...\n");
            }
        }
        System.out.println("Fin del Sistema de Administración de Cuentas");
    }
}
