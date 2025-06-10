import java.util.Scanner;

public class RecetasCocina {
    public static void main(String[] args) {
        System.out.println("*** Recetas de cocina ***");

        var scanner = new Scanner(System.in);

        // Pedimos los datos al usuario
        System.out.print("Ingresa el nombre de la receta: ");
        var nombreReceta = scanner.nextLine();

        System.out.print("Ingresa los ingredientes: ");
        var ingredientesReceta = scanner.nextLine();

        System.out.print("Ingresa el tiempo de preparación (minutos): ");
        var tiempoPreparacion = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingresa la dificultad de la receta (Fácil/Medio/Difícil): ");
        var dificultadReceta = scanner.nextLine();


        // Mostramos los datos al usuario
        System.out.println("\n\n--- Receta de Cocina ---");
        System.out.println("Nombre de la receta: " + nombreReceta);
        System.out.println("Ingredientes de la receta: " + ingredientesReceta);
        System.out.println("Tiempo de preparación: " + tiempoPreparacion);
        System.out.println("Dificultad: " + dificultadReceta);

    }
}
