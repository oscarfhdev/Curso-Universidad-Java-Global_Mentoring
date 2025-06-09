public class TipoVar {
    public static void main(String[] args) {
        System.out.println("*** Tipo Var en Java ***");
        // Sin el uso de var
        String nombre = "Juan";
        System.out.println("nombre = " + nombre);

        // Con el uso de var
        var nombre2 = "Carlos";
        System.out.println("nombre2 = " + nombre2);

        // Definir otras variables usando
        var edad = 30; // Tipo int
        System.out.println("edad = " + edad);
        var sueldo = 5000.5F; // Tipo float
        System.out.println("sueldo = " + sueldo);
        var esCasado = false; // Tipo boolean
        esCasado = true;
        // esCasado = 'No'; // No podemos asignar un tipo distinto

        // Se debe definir su valor
        // var precio; esto lanza un error, tenemos que asignar un valor
        var precio = 10;

        //var apellido = null; No se puede establecer el tipo de dato

    }

}
