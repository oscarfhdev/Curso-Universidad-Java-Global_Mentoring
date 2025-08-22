package test;

import domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        System.out.println("empleado = " + empleado);
        
        System.out.println("empleado = " + empleado.obtenerDetalles());
        
        // Downcasting, tambien podmeos asignar empleado a Escritor class
        System.out.println(((Escritor) empleado).getTipoEscritura());
        
        // Upcasting
        Empleado empleado2 = (Escritor) empleado; // Objeto escritor a empleado
        System.out.println("empleado2 = " + empleado2);
    }
}
