public class NumerosPares {
    public static void main(String[] args) {
        System.out.println("*** Números Pares del 1 al 20 ***");
        var contador = 2;

        while (contador <= 20){
            if (contador % 2 == 0)
                System.out.print(contador + " ");
            contador++;
        }
    }
}
