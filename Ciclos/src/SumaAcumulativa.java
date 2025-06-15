public class SumaAcumulativa {
    public static void main(String[] args) {
        System.out.println("*** Suma Acumulativa ***");


        final var MAXIMO = 15;
        var acumuladorSuma = 0;

        // Iterar los valores
        var numero = 1;
        while (numero <= MAXIMO){
            // Imprimimos lo que se va a sumar
            System.out.println("(acumuladorSuma + numero) -> " + acumuladorSuma + " + " + numero);

            // Realizamos la suma acumulativa
            acumuladorSuma += numero++;

            // Imprimimos la suma parcial acumulada
            System.out.println("Suma parcial acumulada: " + acumuladorSuma + "\n");
        }
        System.out.println("La suma de los primeros " + MAXIMO + " numeros es = " + acumuladorSuma);


        // Alternativa con For
        System.out.println();
        acumuladorSuma = 0;
        for (numero = 1; numero <= MAXIMO; numero++){
            System.out.println("(acumuladorSuma + numero) -> " + acumuladorSuma + " + " + numero);

            acumuladorSuma += numero;

            System.out.println("Suma parcial acumulada: " + acumuladorSuma + "\n");
        }
        System.out.println("La suma de los primeros " + MAXIMO + " numeros es = " + acumuladorSuma);


        // Alternativa con Do-While
        System.out.println();
        acumuladorSuma= 0;
        numero = 1;
        do {
            System.out.println("(acumuladorSuma + numero) -> " + acumuladorSuma + " + " + numero);

            acumuladorSuma += numero++;

            System.out.println("Suma parcial acumulada: " + acumuladorSuma + "\n");
        }while (numero <= MAXIMO);
        System.out.println("La suma de los primeros " + MAXIMO + " numeros es = " + acumuladorSuma);

    }
}
