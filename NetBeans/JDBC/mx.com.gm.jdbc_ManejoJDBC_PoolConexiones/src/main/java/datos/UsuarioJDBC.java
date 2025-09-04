package datos;

import domain.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioJDBC {
        private Connection conexionTransaccional;
        private static final String SQL_SELECT = "SELECT id_usuario, username, password FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario(username, password) VALUES(?, ?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET username = ?, password = ? WHERE id_usuario = ?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?";

    public UsuarioJDBC() {
    }

    public UsuarioJDBC(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }
    
    
    
    public List<UsuarioDTO> seleccionar() throws SQLException{
      Connection conn = null;
      PreparedStatement stmt = null;
      ResultSet rs = null;
      UsuarioDTO usuario = null;
      List<UsuarioDTO> usuarios = new ArrayList<>();
      
      try {
            conn = this.conexionTransaccional != null ? this.  conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                int idUsuario = rs.getInt("id_usuario");
                String username = rs.getString("username");
                String password = rs.getString("password");
                usuario = new UsuarioDTO(idUsuario, username, password);
                usuarios.add(usuario);
            }
        } finally{
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }

            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return usuarios;
    }
    
        
    
    public int insertar (UsuarioDTO usuario) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.  conexionTransaccional : Conexion.getConnection();         
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getUsername());
            stmt.setString(2, usuario.getPassword());
            
            registros = stmt.executeUpdate();
        }        
        finally{
            try {
                Conexion.close(stmt);
             if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }        }
        return registros;
    }
    
    public int actualizar (UsuarioDTO usuario) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.  conexionTransaccional : Conexion.getConnection();      
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setInt(3, usuario.getIdUsuario());
            stmt.setString(1, usuario.getUsername());
            stmt.setString(2, usuario.getPassword());

            
            registros = stmt.executeUpdate();
        } finally{
            try {
                Conexion.close(stmt);
             if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }        }
        return registros;
    }
    
     public int eliminar (UsuarioDTO usuario) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, usuario.getIdUsuario());
            registros = stmt.executeUpdate();
        } finally{
            try {
                Conexion.close(stmt);
             if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }        }
        return registros;
    }}
