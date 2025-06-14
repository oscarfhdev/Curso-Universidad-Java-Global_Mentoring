import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Autenticacion ***");
        var sc = new Scanner(System.in);

        final var USUARIO_VALIDO = "osquitar";
        final var CONTRASENA_VALIDA = "1234";

        System.out.print("Cuál es tu usuario? : ");
        var usuarioIntroducido = sc.nextLine().strip();
        System.out.print("Cuál es tu contraseña? : ");
        var contrasenaIntroducida = sc.nextLine().strip();

        if (usuarioIntroducido.equals(USUARIO_VALIDO) && contrasenaIntroducida.equals(CONTRASENA_VALIDA)){
            System.out.println("Bienvenido al Sistema!");
        } else if (usuarioIntroducido.equals(USUARIO_VALIDO)) {
            System.out.println("Contraseña incorrecta...");
        } else if (contrasenaIntroducida.equals(CONTRASENA_VALIDA)) {
            System.out.println("Usuario incorrecto...");
        }else {
            System.out.println("Usuario y contraseña incorrectos...");
        }


    }
}