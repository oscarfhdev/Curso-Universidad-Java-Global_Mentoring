import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Calificaciones ***");

        var consola = new Scanner(System.in);

        // Pedimos los datos al usuario
        System.out.print("Ingresa tu nota (0 - 10): ");
        var nota = Double.parseDouble(consola.nextLine());

        var resultado = "";

        // Evaluamos las condiciones
        if (nota >= 9 && nota <= 10) {
            resultado = "A";
        }else if (nota >= 8 && nota < 9) {
            resultado = "B";
        } else if (nota >= 7 && nota < 8) {
            resultado = "C";
        } else if (nota >= 6 && nota < 7) {
            resultado = "D";
        } else if (nota >= 0 && nota < 6) {
            resultado = "F";
        }
        else {
            resultado = "Valor desconocido....";
        }

        System.out.println("La nota con número " + nota + " corresponde a el valor: " + resultado);
    }
}
