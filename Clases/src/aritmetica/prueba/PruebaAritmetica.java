package aritmetica.prueba;

import aritmetica.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        System.out.println("*** Ejemplo Aritmetica ***");
        var aritmetica1 = new Aritmetica();
        aritmetica1.setOperando1(5);
        System.out.println("Atributo operando1: " + aritmetica1.getOperando1());
        aritmetica1.setOperando2(7);
        aritmetica1.sumar();
        aritmetica1.restar();

        // Creamos un segundo objeto, inicializando los valores mediante el constructor
        System.out.println();
        var aritmetica2 = new Aritmetica(5,7);
        aritmetica2.sumar();
        aritmetica2.restar();

        // Imprimimos la dirección de memoria del objeto
        System.out.println();
        System.out.println("Dirección de memoria aritmetica1: " + aritmetica1);
        System.out.println("Dirección de memoria aritmetica2: " + aritmetica2);
    }
}
