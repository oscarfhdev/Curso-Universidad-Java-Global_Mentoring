package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    static {
        System.out.println("Se está ejecutando el bloque estático");
        ++Persona.contadorPersonas;
        //idPersona = 10; no se puede, no es static
    }
    {
        // Se ejecuta cada vez que creeemos una instancia de esta clase
        System.out.println("Se está ejecutando el bloque NO estático");
        this.idPersona = Persona.contadorPersonas;
    }

    public Persona() {
        System.out.println("Se está ejecutando el constructor");
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
