import java.util.Scanner;

public class ValidacionPassword {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        var correcto = false;

        System.out.println("\n*** Validación de contraseñas ***");
        while (!correcto){
            // Le pedimos los datos al usuario
            System.out.print("Introduce la contraseña que quieres validar: ");
            var contrasenaAValidar = consola.nextLine();

            // Comprobamos la longitud de la cadena
            if (contrasenaAValidar.length() >= 6) {
                System.out.println("Esta contraseña es válida");
                correcto = true;
            }
            else {
                System.out.println("Esta contraseña no es lo suficientemente larga (6 caracteres)\n");
            }
        }
    }
}
