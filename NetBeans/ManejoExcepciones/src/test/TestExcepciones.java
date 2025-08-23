package test;

import aritmetica.Aritmetica;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;        

//        try {
            resultado = Aritmetica.division(10,0);

//        } catch (Exception e) {
//            System.out.println("Ocurrió un error");

// También podemos poner muchos catch, para capturar todas las excepciones que necesitemos
//            e.printStackTrace(System.out);
//            System.out.println(e.getMessage());
////        }
        
        System.out.println("resultado = " + resultado); // Podemos poner finally también

    }
}
