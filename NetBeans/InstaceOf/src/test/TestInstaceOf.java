package test;

import domain.Empleado;
import domain.Gerente;

public class TestInstaceOf {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Jose", 5000);
        determinarTipo(empleado);
        empleado = new Gerente("Alberto", 25000, "Ventas");
        System.out.println("\n");
        determinarTipo(empleado);
        
    }
    
    public static void determinarTipo(Empleado empleado){
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo gerente");
            Gerente gerente = (Gerente) empleado;
            System.out.println("gerente = " + gerente.getDepartamento());
            System.out.println("departamento gerente: " + ((Gerente) empleado).getDepartamento());
        }
        if (empleado instanceof Empleado) {
            System.out.println("Es de tipo empleado");
            System.out.println("empleado = " + empleado.getNombre());
            System.out.println("empleado = " + empleado.getSueldo());
        }
        if (empleado instanceof Object){
            System.out.println("Es de tipo Object");
            System.out.println("empleado = " + empleado);;
        }
    }
}
