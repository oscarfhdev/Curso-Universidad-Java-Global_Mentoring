import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Autenticacion ***");
        var sc = new Scanner(System.in);

        final var USUARIO_VALIDO = "osquitar";
        final var CONTRASENA_VALIDA = "1234";

        System.out.print("Cuál es tu usuario? : ");
        var usuarioIntroducido = sc.nextLine();
        System.out.print("Cuál es tu contraseña? : ");
        var contrasenaIntroducida = sc.nextLine();

        var acceso = usuarioIntroducido.equals(USUARIO_VALIDO) && contrasenaIntroducida.equals(CONTRASENA_VALIDA);
        System.out.println("¿Los datos son correctos? :  " + acceso);


    }
}
