package persona;

public class Persona{
    private static int contadorPersonas;
    private int idPersona;
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        // Incrementar el atributo static
        this.idPersona = ++Persona.contadorPersonas;
    }

    public Persona(){
        Persona.contadorPersonas++;
    }

    public int getIdPersona(){
        return this.idPersona;
    }
    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void mostrarPersona(){
        var variableLocal = "Valor1";
        System.out.println("Nombre = " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
    }

    public static int getContadorPersonas(){
        return Persona.contadorPersonas;
    }

    // Si no sobreescribimos el método nos muestra la dirección d memoria del objeto
    @Override
    public String toString(){
        return "Id: " + idPersona + ", Nombre: " + this.nombre + ", Apellido: " + this.apellido + "\nMétodo toString de la clase Object " + super.toString();
    }
}