public class FuncionRecursiva {
    // Imprimir del 1 al 5 usando una función recursiva

    // Función recursiva
    static void funcionRecursiva(int numero){
        // Caso Base
        if (numero == 1)
            System.out.print(numero + " ");
        else{
            funcionRecursiva(numero-1);
            System.out.print(numero + " ");
        }
    }
    public static void main(String[] args) {
        funcionRecursiva(5);
    }
}
