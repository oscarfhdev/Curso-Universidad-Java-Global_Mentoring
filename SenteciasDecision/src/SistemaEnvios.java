import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Envíos ***");

        // Definimos los costos de las tarifas por kg
        final var COSTO_TARIFA_NACIONAL = 10;
        final var COSTO_TARIFA_INTERNACIONAL = 20;


        // Solicitanos los datos al usuario
        var consola = new Scanner(System.in);

        System.out.print("Ingrese el destino del paquete (nacional/internacional): ");
        var destino = consola.nextLine();

        System.out.print("Ingrese el peso del paquete (kg): ");
        var pesoKg = Double.parseDouble(consola.nextLine());

        // Calculamos el envío del paquete
        Double costeEnvio = switch (destino){
            case "nacional" -> pesoKg * COSTO_TARIFA_NACIONAL;
            case "internacional" -> pesoKg * COSTO_TARIFA_INTERNACIONAL;
            default -> {
                System.out.println("Destino inválido, ingresa correctamente los valores (true / false)");
                yield null;
            }
        };

        // Imprmimos el resultado
        if(costeEnvio != null)
            System.out.printf("El costo del envío, para un paquete de %.2fkg es $%.2f dolares ", pesoKg, costeEnvio);
    }
}
