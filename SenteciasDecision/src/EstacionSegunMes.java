import java.util.Scanner;

public class EstacionSegunMes {
    public static void main(String[] args) {
        System.out.println("*** Identificador de Estaciones ***");

        var consola = new Scanner(System.in);

        System.out.print("Ingresa un mes del año (1- 12): ");
        var mesAno = Integer.parseInt(consola.nextLine());
        var estacion = "";

        // Evaluamos las condiciones
        /*
        if (mesAno < 1 || mesAno > 12){
            estacion = "desconocida...";
        } else if (mesAno == 1 || mesAno == 2 || mesAno == 12) {
            estacion = "Invierno";
        } else if (mesAno == 3 || mesAno == 4 || mesAno == 5) {
            estacion = "Primavera";
        } else if (mesAno == 6 || mesAno == 7 || mesAno == 8) {
            estacion = "Verano";
        }
        else {
            estacion = "Otoño";
        }

         */

        // Hecho ahora con switch mejorado
        estacion = switch (mesAno){
            case 1, 2, 12 -> "Invierno";
            case 3, 4, 5 -> "Primavera";
            case 6, 7, 8 -> "Verano";
            case 9, 10, 11 -> "Otoño";
            default -> "desconocida...";
        };

        System.out.printf("La estación para el mes %d es %s" ,mesAno, estacion);

    }
}
