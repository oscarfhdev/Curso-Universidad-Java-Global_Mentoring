package clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.apellido = "Caro";
        persona1.desplegarInformacion();
        
        Persona persona2 = new Persona();
        System.out.println("persona1 = " + persona1);
        System.out.println("persona2 = " + persona2);
        persona2.desplegarInformacion();
        persona2.nombre = "Javier";
        persona2.apellido = "Carrillo";
        persona2.desplegarInformacion();

    }
}
