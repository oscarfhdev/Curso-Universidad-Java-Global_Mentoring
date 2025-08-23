package test;

import domain.Persona;

public class TestJavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setApellido("Gutiérrez");
        persona.setNombre("Alberto");
        System.out.println("persona = " + persona);
        System.out.println("persona = " + persona.getNombre());
        System.out.println("persona = " + persona.getApellido());
    }
}
