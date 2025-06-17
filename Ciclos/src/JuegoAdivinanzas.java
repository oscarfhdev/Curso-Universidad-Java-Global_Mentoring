import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanzas {
    public static void main(String[] args) {
        System.out.println("*** Adivinanza del Número ***");
        // Instanciamos objeto Random y declaramos las variables
         var random = new Random();
         final var NUMERO_SECRETO = random.nextInt(50)+1;
         final var CANTIDAD_MAXIMA_INTENTOS = 5;
         var consola = new Scanner(System.in);
         var cantidadIntentos = 0;

        var numeroAdivinado = false;
        // Creamos el bucle
        while (!numeroAdivinado){
            System.out.print("\nIntenta adivinar el número correcto (1-50): ");
            var numeroIntroducido = consola.nextInt();

            // Valoramos las posibles entradas, añadimos una ayuda al usuario
            if(numeroIntroducido < 1 || numeroIntroducido > 50)
                System.out.println("Recuerda que el número que intentas adivinar se encuentra entre 1 y 50");
            else if (numeroIntroducido < NUMERO_SECRETO){
                System.out.println("El número que intentas adivinar es más grande que " + numeroIntroducido + "!!");
            } else if (numeroIntroducido > NUMERO_SECRETO) {
                System.out.println("El número que intentas adivinar es más pequeño que " + numeroIntroducido + "!!");
            }
            cantidadIntentos++;
            if (numeroIntroducido == NUMERO_SECRETO){
                System.out.println("¡Correcto! El número secreto es " + NUMERO_SECRETO + ", lo has adivinado al intento nº " + cantidadIntentos);
                numeroAdivinado = true;
            }
            if (cantidadIntentos == CANTIDAD_MAXIMA_INTENTOS){
                numeroAdivinado = true;
                System.out.println("Has llegado a la cantidad máxima de intentos :( (" + CANTIDAD_MAXIMA_INTENTOS + "), el número secreto era " + NUMERO_SECRETO);
            }
        }
    }
}
