package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 5000.00, false);
        //persona1.nombre = "Carlos";
        System.out.println("persona1 nombre: " + persona1.getNombreCompleto());
        persona1.setNombreCompleto("Alberto Jímenez");
        System.out.println("persona1 nombre completo: " + persona1.getNombreCompleto());
        System.out.println("persona1 sueldo: " + persona1.getSueldo());
        System.out.println("persona1 eliminado: " + persona1.isEliminado());
        System.out.println(persona1);
    }
}
