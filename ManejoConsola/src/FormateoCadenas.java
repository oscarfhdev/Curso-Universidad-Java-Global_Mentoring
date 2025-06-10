public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("*** Formateo de Cadenas ***");
        var nombre = "Matías";
        var edad = 35;
        var salario = 21000.5067;
        var numeroEmpleado = 112;

        // String.format
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: $%.2f", nombre, edad, salario);
        System.out.println(mensaje);

        // Método printf
        System.out.printf("Nombre: %s, Edad: %d, Salario: $%.2f%n", nombre, edad, salario);

        // Formateo con text block
        mensaje = """
                %n Detalle Persona:\s
                --------------------------------
                \tNombre: %s
                \tNúmero de Empleado: %04d
                \tEdad: %d
                \tSalario: $%.2f
                --------------------------------
                """.formatted(nombre, numeroEmpleado, edad,salario);
        System.out.println(mensaje);

        // Formateo con text block y printf directamente
        System.out.printf("""
                %n Detalle Persona:\s
                --------------------------------
                \tNombre: %s
                \tNúmero de Empleado: %04d
                \tEdad: %d
                \tSalario: $%.2f
                --------------------------------
                """, nombre, numeroEmpleado, edad, salario);
    }
}
