package test;

import datos.Conexion;
import datos.PersonaJDBC;
import domain.Persona;
import java.sql.*;
import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        
        Connection conexion = null;

        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            
            PersonaJDBC personaJDBC = new PersonaJDBC(conexion);
            Persona cambioPersona = new Persona();
            cambioPersona.setIdPersona(2);
            cambioPersona.setNombre("Carla Alberta");
            cambioPersona.setApellido("Mazueco");
            cambioPersona.setEmail("carla@carla.es");
            cambioPersona.setTelefono("2938424");
            personaJDBC.actualizar(cambioPersona);
            
            
            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Carlos");
            nuevaPersona.setApellido("Ramirez");
            personaJDBC.insertar(nuevaPersona);
            
            cambioPersona.setIdPersona(6);
            cambioPersona.setNombre("Carlos");
            nuevaPersona.setApellido("Ramirez");
            cambioPersona.setEmail("carlos@ramirez.es");
            cambioPersona.setTelefono("324248424");
            personaJDBC.actualizar(cambioPersona);
            
            conexion.commit();
            System.out.println("Se ha hecho commit de la transacción");
            
        } catch (SQLException e) {
            e.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
    }
}
