import java.util.Scanner;

public class FuncionPar {
    // Función para saner si un número es par

    static boolean esPar(int numero){
//        if (numero % 2 == 0)
//            return true;
//        return false;

        return (numero % 2 == 0) ? true: false;
    }

    public static void main(String[] args) {
        System.out.print("Proporciona un valor numérico: ");
        var numero = Integer.parseInt(new Scanner(System.in).nextLine());

        System.out.println("¿Es par " + numero + "? " + esPar(numero));
    }
}
