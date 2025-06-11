import java.util.Scanner;

public class SistemaPrestamoLibros {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Préstamo del Libros ***");
        final var DISTANCIA_PERMITIDA_KM = 3;
        var consola = new Scanner(System.in);

        System.out.print("¿Cuentas con credencial de estudiante? (true / false): ");
        var tieneCrendencial = Boolean.parseBoolean(consola.nextLine());

        System.out.print("¿A cuanto vives de la biblioteca? :");
        var distanciaBibliotecaKM = Integer.parseInt(consola.nextLine());

        var esElegiblePrestamo = (distanciaBibliotecaKM <= DISTANCIA_PERMITIDA_KM) || tieneCrendencial;
        System.out.println("¿Eres elegible para préstamo de libros? : " + tieneCrendencial);
    }
}
