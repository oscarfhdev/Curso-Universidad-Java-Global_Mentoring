public class DetalleProducto {
    public static void main(String[] args) {
        // Declaramos y asignamos el valor a las variables
        System.out.println("*** Tienda en línea (Detalle Producto)***");
        String nombreProducto = "Balón de fútbol";
        double precioProducto = 19.99;
        int cantidadDisponible = 20;
        boolean isDisponible = true;

        // Imprimimos las variables
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("isDisponible = " + isDisponible);


        // Repetimos el proceso
        System.out.println();
        nombreProducto = "Tabla de surf";
        precioProducto = 105.99;
        cantidadDisponible = 3;
        isDisponible = false;

        // Imprimimos las variables
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("isDisponible = " + isDisponible);
    }
}
