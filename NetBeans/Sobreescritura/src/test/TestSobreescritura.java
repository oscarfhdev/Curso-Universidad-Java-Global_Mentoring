package test;

import domain.Empleado;
import domain.Gerente;

public class TestSobreescritura {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Jose", 5000);
        System.out.println("empleado = " + empleado.obtenerDetalles());
        
        Gerente gerente = new Gerente("Alberto", 25000, "Ventas");
        System.out.println("gerente = " + gerente.obtenerDetalles());
        
        
        // Podemos poner tambien empleado = new Gerente...
        imprimir(empleado);
        imprimir(gerente);
    }
    
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}
