package test;

import operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(8,8);
        System.out.println("resultado = " + resultado);
        var resultado2 = Operaciones.sumar(1, 2.4);
        System.out.println("resultado2 = " + resultado2);
    }
}
