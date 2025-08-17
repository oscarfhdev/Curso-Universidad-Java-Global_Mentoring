package pasoporreferencia;

import persona_prueba.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setNombre("Juan");
        System.out.println("persona1 nombre = " + persona1.getNombre());
        persona1 = cambiarValor(persona1);
        System.out.println(persona1.getNombre());
    }
    
    public static Persona cambiarValor(Persona persona){
        if (persona == null) {
            System.out.println("Valor de persona inválido: null");
            return null;
        }
        persona.setNombre("Karla");
        return persona;
    }
}
