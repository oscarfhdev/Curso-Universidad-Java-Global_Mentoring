package test;

import datos.Conexion;
import datos.UsuarioJDBC;
import domain.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestManejoUsuario {
    public static void main(String[] args) {
         Connection conexion = null;

        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            
            UsuarioJDBC usuarioJDBC = new UsuarioJDBC(conexion);
            Usuario cambioUsuario = new Usuario();
            cambioUsuario.setIdUsuario(2);
            cambioUsuario.setUsername("oscarfh");
            cambioUsuario.setPassword("sfdfjda");
            
            usuarioJDBC.actualizar(cambioUsuario);
            
            
            Usuario nuevoUsuario = new Usuario();
            nuevoUsuario.setUsername("nuevouser");
            nuevoUsuario.setPassword("fsdakñjlljkñfs");
            usuarioJDBC.insertar(nuevoUsuario);
            

            
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
