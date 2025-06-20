package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("*** Creación de clase y Objetos Persona ***");

        var objeto1 = new Persona();
        objeto1.setNombre("Layla");
        objeto1.setApellido("Acosta");

        objeto1.mostrarPersona();

        // Segundo objeto
        System.out.println();
        var objeto2 = new Persona("Ian", "Gómez");
        objeto2.mostrarPersona();

        System.out.println();
        // Utilizamos el método toString
        //System.out.println(objeto2.toString());
        System.out.println(objeto2); // Automáticamente llama a toString()
    }
}
