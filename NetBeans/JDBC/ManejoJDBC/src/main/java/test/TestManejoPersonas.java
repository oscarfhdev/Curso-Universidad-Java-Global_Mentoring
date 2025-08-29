package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();
        List<Persona> personas = personaDAO.seleccionar();
//        for (Persona persona : personas) {
//            System.out.println("persona = " + persona);
//        }
        
        
//        System.out.println("\n\n");
        // Hacemos la prueba para insertar un nuevo objeto persona
//        Persona nuevaPersona = new Persona("Carlos", "Esperpento", "carlos@carlos.es", "834928");
        // personaDAO.insertar(nuevaPersona);
        
//        personas = personaDAO.seleccionar();
//        for (Persona persona : personas) {
//            System.out.println("persona = " + persona);
//        }
//        
//        System.out.println("\n\n");

        
        // Modificar un registro de persona existente
//        Persona personaModificar = new Persona(4, "kero", "kero",  "kero", "kero");
//        Persona personaModificar2 = new Persona(5, "kero2", "kero2",  "kero2", "kero2");
//        personaDAO.actualizar(personaModificar);
//        personaDAO.actualizar(personaModificar2);
        
        // Imprimimos de nuevo, no hacemos método para ahorrar tiempo
//        personas = personaDAO.seleccionar();
//        for (Persona persona : personas) {
//            System.out.println("persona = " + persona);
//        }
        
        Persona personaEliminar = new Persona(5);
        personaDAO.eliminar(personaEliminar);

        personas = personaDAO.seleccionar();
        for (Persona persona : personas) {
            System.out.println("persona = " + persona);
        }
        
    }
}
