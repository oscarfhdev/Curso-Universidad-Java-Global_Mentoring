import java.util.Random;
import java.util.Scanner;

public class GeneradorIdUnico {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        // Solicitamos los valores al usuario
        System.out.println("*** Sistema Generador de ID único ***");
        System.out.print("¿Cuál es tu nombre?: ");
        var nombre = scanner.nextLine();
        System.out.print("¿Cuál es tu apellido?: ");
        var apellido = scanner.nextLine();
        System.out.print("¿Cuál es tu año de nacimiento (YYYY)?: ");
        var fechaNacimiento = scanner.nextLine();

        // Genero el número random
        var random = new Random();
        var numeroGenerado = random.nextInt(9999)+1;

        // Ponemos los valores correctamente
        var nombreNormalizado = nombre.trim().toUpperCase().substring(0,2);
        var apellidoNormalizado = apellido.trim().toUpperCase().substring(0,2);
        var fechaNacimientoNormalizado = fechaNacimiento.trim().toUpperCase().substring(2,4);

        // Juntamos todo y creamos el ID único
        var idUnico = nombreNormalizado + apellidoNormalizado + fechaNacimientoNormalizado + String.format("%04d", numeroGenerado);

        System.out.printf("""
                %nHola %s
                \tTu nuevo número de identificación es:
                \t%s
                \tFelicidades!
                """,nombre, idUnico);
    }
}
