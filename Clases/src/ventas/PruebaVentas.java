package ventas;

import persona.Persona;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Ventas ***");

        var producto1 = new Producto("Blusa", 30);
        System.out.println(producto1);

        var producto2 = new Producto("Zapatos", 50);
        System.out.println(producto2);

        // Primera orden
        System.out.println();
        var orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();

        // Segunda orden
        var orden2 = new Orden();
        orden2.agregarProducto(new Producto("Camiseta", 16.00));
        orden2.agregarProducto(new Producto("Cinturón", 19.99));
        System.out.println(orden2);
    }
}
