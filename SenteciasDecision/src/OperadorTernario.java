public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("*** Operador Ternario ***");

        // Sintaxis
        // condicion ? exp1 : exp2

        // Determinar si un número es par o no
        var numero = 4;
        var resultado = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println("El número " + numero + " es " + resultado);

        // Calcular si es mayor de edad
        var edad = 17;
        var mensaje = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
        System.out.println("Tienes " + edad + ", " + mensaje);

        // Valor positivi, negativo o cero (operador ternario anidado)
        numero = 10;
        resultado = (numero > 0) ? "Positivo" : (numero < 0) ? "Negativo" : "Cero";
        System.out.println("El valor es " + resultado);
    }
}
