package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Caro");
        System.out.println("persona desde main" + persona);
        System.out.println("persona nombre: " + persona.nombre);
        System.out.println("persona apellido:" + persona.apellido);
    }
}
class Persona{
        String nombre;
        String apellido;
        
        Persona (String nombre, String apellido){
            this.nombre = nombre;
            this.apellido = apellido;
            System.out.println("Objeto persona usando this: " + this);
            new Imprimir().imprimir(this);

    }
}

class Imprimir{

    public Imprimir() {
        super(); // el constuctor de la clase padre (object) para reservar memoria
    }
    
    public void imprimir (Persona persona) {
        System.out.println("Persona desde imprimir: " + persona);
        System.out.println("Impresión del objeto actual (this): " + this);
    }
}
