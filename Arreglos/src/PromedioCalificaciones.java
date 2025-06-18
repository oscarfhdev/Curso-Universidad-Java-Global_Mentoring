import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        System.out.println("***  Promedio de Calificaciones***");

        var consola = new Scanner(System.in);
        var totalCalificaciones = 0;

        System.out.print("¿Cuántas calificaciones deseas agregar? : ");
        var numeroCalificaciones = consola.nextInt();

        // Declaramos e incializamos el array
        var calificaciones = new int[numeroCalificaciones];

        for (int i = 0; i < numeroCalificaciones; i++){
            System.out.print("Ingresa la Calificacion " + (i+1) + " : ");
            calificaciones[i] = consola.nextInt();
            totalCalificaciones += calificaciones[i];
        }

        System.out.println("El promedio de las calificaciones es: " + totalCalificaciones / numeroCalificaciones);

    }
}
