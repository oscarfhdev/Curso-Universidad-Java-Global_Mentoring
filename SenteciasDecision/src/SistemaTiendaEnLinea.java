import java.util.Scanner;

public class SistemaTiendaEnLinea {
    public static void main(String[] args) {
        System.out.println("*** Tienda en Línea con Descuentos***");

        final var MONTO_MINIMO_DESCUENTO = 1000;
        var porcentajeDescuento = 0;
        double descuentaAplicado;
        double montoFinal;

        var scanner = new Scanner(System.in);
        System.out.print("¿Cuál fue el monto de tu compra? : ");
        var montoCompra = Double.parseDouble(scanner.nextLine());
        System.out.print("¿Eres miembro de la tienda? (true / false): ");
        var esMiembroTienda = Boolean.parseBoolean(scanner.nextLine());

        if (montoCompra > MONTO_MINIMO_DESCUENTO && esMiembroTienda){
            porcentajeDescuento = 10;
        } else if (montoCompra <= MONTO_MINIMO_DESCUENTO && esMiembroTienda) {
            porcentajeDescuento = 5;
        }

        if (porcentajeDescuento != 0){
            descuentaAplicado = montoCompra * (porcentajeDescuento / 100.0);
            montoFinal = montoCompra - descuentaAplicado;
            System.out.printf("""
                    Felicidades, has obtenido un descuento del %d%%
                    Monto de la compra: $%.2f
                    Monto del descuento: $%.2f
                    Monto final de la compra con descuento: $%.2f
                    """, porcentajeDescuento, montoCompra, descuentaAplicado, montoFinal);
        }
        else{
            System.out.printf("""
                    No obtuviste ningún tipo de descuento
                    Le invitamos a hacerse miembro de la tienda
                    Monto final de la compra: $%.2f
                    """, montoCompra);
        }
    }
}
