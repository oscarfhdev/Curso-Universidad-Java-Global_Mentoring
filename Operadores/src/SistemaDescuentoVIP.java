import java.util.Scanner;

public class SistemaDescuentoVIP {
    public static void main(String[] args) {
        System.out.println("*** Sistemas de Descuentos VIP ***");
        final var NUMERO_PRODUCTOS_DESCUENTO = 10;
        var consola = new Scanner(System.in);

        System.out.print("¿Cuántos productos compraste hoy? : ");
        var cantidadProductos = Integer.parseInt(consola.nextLine());

        System.out.print("¿Tienes la membresía de la tienda (true/false)? : ");
        var tieneMembresia = Boolean.parseBoolean(consola.nextLine());

        var esElegibleDescuento =  (cantidadProductos >= NUMERO_PRODUCTOS_DESCUENTO) && tieneMembresia;
        System.out.println("¿Tienes acceso al descuento VIP? : " + esElegibleDescuento);
    }
}
