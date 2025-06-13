public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("*** Operador Ternario ***");

        // Sintaxis
        // condicion ? exp1 : exp2

        // Determinar si un número es par o no
        var numero = 4;
        var resultado = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println("El número " + numero + " es " + resultado);


    }
}
