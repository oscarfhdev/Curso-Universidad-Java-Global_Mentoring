package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMySqlJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, "root", "CONTRASEÑA");
            
            Statement instruccion = conexion.createStatement();
            var sql = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            while (resultado.next()){
                System.out.print("id_persona = " + resultado.getInt("id_persona"));
                System.out.print(", nombre = " + resultado.getString("nombre"));
                System.out.println(", apellido = " + resultado.getString("apellido"));
            }
            resultado.close();
            instruccion.close();
            conexion.close();
            
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
}
}
