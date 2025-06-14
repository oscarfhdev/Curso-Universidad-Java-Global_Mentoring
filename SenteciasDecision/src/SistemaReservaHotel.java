import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** Bienvenido al Sistema de Reserva de Hotel ***");

        // Definimos los constantes
        final var COSTO_HABITACION_SIN_VISTAS = 150.50;
        final var COSTO_HABITACION_CON_VISTAS = 190.50;

        var consola = new Scanner(System.in);

        // Solicitamos los datos al usuario
        System.out.print("Nombre del cliente: ");
        var nombre = consola.nextLine();

        System.out.print("Días de estadía: ");
        var diasEstadia = Integer.parseInt(consola.nextLine());

        System.out.print("¿Con vista al mar? (true/false) : ");
        var hasVistaAlMar = Boolean.parseBoolean(consola.nextLine());

        // Declaramos las variables necesarias
        double costoTotal;

        // Evaluamos las condiciones
        if (hasVistaAlMar){
            costoTotal = COSTO_HABITACION_CON_VISTAS * diasEstadia;
        }
        else {
            costoTotal = COSTO_HABITACION_SIN_VISTAS * diasEstadia;
        }

        // Imprimimos el resultado
        System.out.printf("""
                %n------------- Detalle de la reservación -------------
                \tCliente: %s
                \tDías de estadía: %d
                \tCosto total: %.2f
                \tHabitacion con vista al mar: %s
                -----------------------------------------------------
                """, nombre, diasEstadia, costoTotal, hasVistaAlMar ? "Sí :)" : "No :(");

    }
}
