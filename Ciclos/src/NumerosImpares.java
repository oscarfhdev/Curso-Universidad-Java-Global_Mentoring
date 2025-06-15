public class NumerosImpares {
    public static void main(String[] args) {
        System.out.println("Imprimir Números Impares");

        var contador = 0;

        while (contador <= 20){
            if (contador % 2 != 0)
                System.out.print(contador + " ");
        contador++;
        }

        System.out.println();
        contador= 0;
        do {
            if (contador % 2 != 0)
                System.out.print(contador + " ");
            contador++;
        }while (contador <= 20);
    }
}
