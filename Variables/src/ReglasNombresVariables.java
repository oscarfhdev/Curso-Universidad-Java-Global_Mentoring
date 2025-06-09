public class ReglasNombresVariables {
    public static void main(String[] args) {
        // Reglas en los nombres de las variables
        String nombreCompleto = "Juan Carlos"; //Correcto, y buenas prácticas
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "Juan Carlos 2"; // Correcto, no aplica las buenas prácticas
        System.out.println("NombreCompleto = " + NombreCompleto);
        // String nombre-cliente = "Juan"; // Incorrecto
        String nombre_cliente = "Juan"; // Correcto, pero no aplica las buenas prácticas
        String _apellido = "_Perez"; // Correcto y aceptable
        String $apellido = "$Juarez"; // Correcta y aceptable
        int totPzs = 10; // Correcto, no aplica las buenas prácticas
        int totalPiezas = 10; // Correcto, aplica las buenas prácticas
        boolean casado = true; // Correcto, aún puede mejorar
        boolean esCasado = true; // Correcto, y aplica buenas prácticas
        boolean isCasado = true; // Correcto, y aplica buenas prácticas
        boolean tieneSaldo = true; // Correcto, y aplica buenas prácticas
        boolean hasSaldo = true; // Correcto, y aplica buenas prácticas
    }
}
