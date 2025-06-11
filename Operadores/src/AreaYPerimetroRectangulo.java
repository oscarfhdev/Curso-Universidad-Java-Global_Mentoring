import java.util.Scanner;

public class AreaYPerimetroRectangulo {
    public static void main(String[] args) {
        System.out.println("*** Calcular área y perímetro de un rectángulo ***");

        var sc = new Scanner(System.in);

        System.out.print("Ingresa la base del rectángulo: ");
        var base = Double.parseDouble(sc.nextLine());
        System.out.print("Ingresa la altura del rectángulo: ");
        var altura = Double.parseDouble(sc.nextLine());

        System.out.println("El área del rectángulo es: " + base*altura);
        System.out.println("El perímetro del rectángulo es: " + (base+altura)*2);

    }
}
