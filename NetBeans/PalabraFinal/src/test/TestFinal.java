package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10;
        // Persona.MI_CONSTANTE = 2; // no se puede asignar valores a final
        
        System.out.println(Persona.MI_CONSTANTE);
        
        final Persona persona1 = new Persona();
        //persona1 = new Persona(); no se puede
        persona1.setNombre("Alberto");
        System.out.println(persona1.getNombre());
        System.out.println("persona1 = " + persona1);
                System.out.println(persona1.getNombre());
        persona1.setNombre("Ricardo");
        System.out.println("persona1 = " + persona1);
    }
}
