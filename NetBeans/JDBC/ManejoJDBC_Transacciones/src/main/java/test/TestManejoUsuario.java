package test;

import datos.UsuarioJDBC;
import domain.Usuario;
import java.util.List;

public class TestManejoUsuario {
    public static void main(String[] args) {
        UsuarioJDBC usuarioDAO = new UsuarioJDBC();
        
        List<Usuario> usuarios = usuarioDAO.seleccionar();
//        usuarios.forEach(usuario -> System.out.println("usuario = " + usuario));
        
//        Usuario usuarioInsertar = new Usuario("alba", "albitaa");
//        usuarioDAO.insertar(usuarioInsertar);
        
//        Usuario usuarioActualizar = new Usuario(4, "ventura", "venturita");
//        usuarioDAO.actualizar(usuarioActualizar);
        
        Usuario usuarioEliminar = new Usuario(4);
        usuarioDAO.eliminar(usuarioEliminar);

        usuarios = usuarioDAO.seleccionar();
        usuarios.forEach(usuario -> System.out.println("usuario = " + usuario));
    }
}
