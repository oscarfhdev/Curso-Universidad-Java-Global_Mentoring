package aritmetica;

import excepciones.OperacionExcepcion;

public class Aritmetica {
    public static int division(int numerador, int denominador) throws OperacionExcepcion{
        if (denominador == 0) {
            throw new OperacionExcepcion("El denominador es 0");
        }
        
        return  numerador/denominador;
        
    }
}
